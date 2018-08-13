# MemeToaster

This is an Android library for toasting memes.

Currently, it supports image memes and ASCII art memes.

It contains a rpeository of classic and most popular memes and convenience functions to toast them.

## Samples

```
val memeToaster = MemeToaster(context)

//Toast the 'Aww Yeah' meme
memeToaster.awwYeah()

//Toast the `Fuuu` meme with ooptional text
memeToaster.fuuu("That shouldn't have happened!")

//Toast the tableflip meme
memeToaster.toastyMeme(
        Memes.Ascii.TableFlip
)

//Toast a large Lenny
memeToaster.toastyMeme(
        Memes.Ascii.Lenny,
        Dimensions.Text.Large
)
```
