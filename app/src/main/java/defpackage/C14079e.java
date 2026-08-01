package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14079e extends AbstractC6080e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient int f27839e = 1;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object[] f27840e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f27841e;

    public C14079e(int i, Object[] objArr) {
        this.f27840e = objArr;
        this.f27841e = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC7023e.smaato(i, this.f27839e);
        Object obj = this.f27840e[i + i + this.f27841e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27839e;
    }
}
