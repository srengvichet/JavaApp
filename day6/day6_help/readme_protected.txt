
What does it mean for a subclass-outside-the-package to have access to a
superclass (parent) protected member?

 It means the subclass inherits the member. It does not,
however, mean the subclass-outside-the-package can access the member using a
reference to an instance of the superclass. In other words, protected = inheritance.
Protected does not mean that the subclass can treat the protected superclass member as though it were public.

 So if the subclass-outside-the-package gets a reference to
the superclass  the subclass cannot use the dot operator on the superclass
reference to access the protected member. To a subclass-outside-the-package, a
protected member might as well be default (or even private), when the subclass is
using a reference to the superclass. The subclass can see the protected member
only through inheritance.

SUMMARY 
For a subclass outside the package, the protected member can be accessed only
through inheritance.

Note 2

Once the subclass-outside-the-package inherits the protected member,
that member (as inherited by the subclass) becomes private to any code outside
the subclass, with the exception of subclasses of the subclass.
