# Rapport
Det första som gjordes var att skapa en till activity vilket görs enkelt via File -> New -> 
Activity -> Empty Activity.

När sidan var skapad så behövdes ett sätt att komma till den vilket gjordes via en knapp på 
MainActivity sidan. I Kod 1 så visas en eventListener som satts på knappen som akntiveras när 
knappen klickas på och används för att öppna och skicka data till SecondActivity. 
En Intent används för att starta aktiviteten och för att skicka med lite data till den.

``things`` och ``numberOf`` variablerna referar till två input fält där användaren kan skriva
in vad det är för något och hur många det är.

```
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String thingsText = things.getText().toString();
        int numberOfText = Integer.parseInt(numberOf.getText().toString());

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("thing", thingsText);
        intent.putExtra("numberOf", numberOfText);
        startActivity(intent);
    }
});
```
Kod 1: Funktionen knappen kallar

För att fånga datan så används koden i Kod 2. Två variabler skapas för att kunna ändra texten 
i två olika TextViews. Först så måste det säkerställas att datan inte är null. Ifall det finns data
att använda så sparas den i två olika variabler, en för string och en för int. Variablerna används
sedan för att skriva hur många av någonting som skickades med. Att försöka skriva ut en int
gjorde att appen crashade så den behövde String.valueOf för att göra om värdet till en string.

Sidan som tar emot data visas i Bild 1.

```
protected void onCreate(Bundle savedInstanceState) {
    [...]
    TextView numberText = findViewById(R.id.textView_numberOf);
    Bundle extras = getIntent().getExtras();
    if (extras != null) {
        String things = extras.getString("thing");
        int numberOf = extras.getInt("numberOf");
        numberText.setText(String.valueOf(numberOf) + " " + things);
    }
}
```
Kod 2: Kod som fångar och använder datan

![](img.png)
Bild 1: Bild på sidan som tar emot data