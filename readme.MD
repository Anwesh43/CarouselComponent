#CarouselComponent

##A simple android library to add carousel in android app.

##Usage

###In Activity file initializing a carousel

```

  CarouselComponent carouselComponent = new CarouselComponent(this);

```

###In activity file adding a carousel component

```
       carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc1),"First Component"));
      carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc2),"Second Component"));
      carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc3),"Third Component"));
      carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc4),"Fourth Component"));
```

###In activity file creating carousel

```
    carouselComponent.create();
```
