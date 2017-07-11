:load scripts/images.sc
:load scripts/paleography.sc
:load scripts/texts.sc

object Validate{

  /**
  Does both Paleo and Image indexing validation for the iliad
  **/
  def iliad = {
    Images.iliad
    Paleography.iliad
  }

  /**
  Does both Paleo and Image indexing validation for the scholia
  **/
  def scholia = {
    Images.scholia
    Paleography.scholia
  }

  /**
  Checks your texts XML
  **/
  def texts = {
    Markup.texts
  }

  /**
  Does all the image indexing validation for both the iliad and the scholia
  **/
  def allImages = {
    Images.iliad
    Images.scholia
  }

  /**
  Does all the paleo validation for both the iliad and the scholia
  **/
  def allPaleo = {
    Paleography.iliad
    Paleography.scholia
  }

  /**
  Does Paleography index validation, Image indexing validation and text markup
  validation
  **/
  def all{
    iliad
    scholia
    texts
  }

}
