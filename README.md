# Simple App that uses jetPack.
## git gets input and shows it in List

## The UI Consists one Parent Column, whos child are a Row(with textField and Button) and a LazyList


* In row we have a TextField(OutlinedTextField)
That takes a value(current) and onValueChange(called when changed).
onValueChange is lamda

* We need to make a state with empty string value, that will be initial value of textField

```onValueChange{text->what_happens_to_text} ex:onvaluechange{text->name=text}```

**This is a two way binding, since change in text field causes to execute the onValueChange that updates the state**

* Now add a button