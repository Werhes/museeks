package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۤٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15068e extends AbstractC8718e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8718e f29830e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f29831e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f29832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15068e(AbstractC8718e abstractC8718e, int i, int i2) {
        super(2);
        this.f29830e = abstractC8718e;
        this.f29832e = i;
        this.f29831e = i2;
    }

    @Override // defpackage.AbstractC10054e
    public final int adcel() {
        return this.f29830e.startapp() + this.f29832e + this.f29831e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0259e.billing(i, this.f29831e);
        return this.f29830e.get(i + this.f29832e);
    }

    @Override // defpackage.AbstractC8718e, java.util.List
    /* renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final AbstractC8718e subList(int i, int i2) {
        AbstractC0259e.startapp(i, i2, this.f29831e);
        int i3 = this.f29832e;
        return this.f29830e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29831e;
    }

    @Override // defpackage.AbstractC10054e
    public final int startapp() {
        return this.f29830e.startapp() + this.f29832e;
    }

    @Override // defpackage.AbstractC10054e
    public final Object[] yandex() {
        return this.f29830e.yandex();
    }
}
