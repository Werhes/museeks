package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14273e implements TypeVariable, Type {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC12635e f28240e;

    public C14273e(InterfaceC12635e interfaceC12635e) {
        this.f28240e = interfaceC12635e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !AbstractC7890e.billing(this.f28240e.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.f28240e.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC9546e.yandex((InterfaceC13984e) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new Error(AbstractC17861e.Signature("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f28240e));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f28240e.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f28240e.getName();
    }

    public final int hashCode() {
        this.f28240e.getName().getClass();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f28240e.getName();
    }
}
