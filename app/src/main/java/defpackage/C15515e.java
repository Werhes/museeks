package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15515e extends AbstractC4517e implements Iterable, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f30648e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f30649e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final List f30650e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f30651e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float f30652e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f30653e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final List f30654e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f30655e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float f30656e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float f30657e;

    public C15515e(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f30655e = str;
        this.f30651e = f;
        this.f30649e = f2;
        this.f30653e = f3;
        this.f30648e = f4;
        this.f30657e = f5;
        this.f30656e = f6;
        this.f30652e = f7;
        this.f30654e = list;
        this.f30650e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C15515e)) {
            C15515e c15515e = (C15515e) obj;
            return AbstractC7890e.billing(this.f30655e, c15515e.f30655e) && this.f30651e == c15515e.f30651e && this.f30649e == c15515e.f30649e && this.f30653e == c15515e.f30653e && this.f30648e == c15515e.f30648e && this.f30657e == c15515e.f30657e && this.f30656e == c15515e.f30656e && this.f30652e == c15515e.f30652e && AbstractC7890e.billing(this.f30654e, c15515e.f30654e) && AbstractC7890e.billing(this.f30650e, c15515e.f30650e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30650e.hashCode() + AbstractC17861e.billing(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(this.f30655e.hashCode() * 31, this.f30651e, 31), this.f30649e, 31), this.f30653e, 31), this.f30648e, 31), this.f30657e, 31), this.f30656e, 31), this.f30652e, 31), 31, this.f30654e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C11927e(this);
    }
}
