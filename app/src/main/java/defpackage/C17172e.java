package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٞۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17172e extends AbstractC4354e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4354e f33669e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f33670e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f33671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17172e(AbstractC4354e abstractC4354e, int i, int i2) {
        super(0);
        this.f33669e = abstractC4354e;
        this.f33671e = i;
        this.f33670e = i2;
    }

    @Override // defpackage.AbstractC10054e
    public final Object[] advert() {
        return this.f33669e.advert();
    }

    @Override // defpackage.AbstractC10054e
    public final int billing() {
        return this.f33669e.startapp() + this.f33671e + this.f33670e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4608e.appmetrica(i, this.f33670e);
        return this.f33669e.get(i + this.f33671e);
    }

    @Override // defpackage.AbstractC4354e, java.util.List
    /* renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final AbstractC4354e subList(int i, int i2) {
        AbstractC4608e.billing(i, i2, this.f33670e);
        int i3 = this.f33671e;
        return this.f33669e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33670e;
    }

    @Override // defpackage.AbstractC10054e
    public final int startapp() {
        return this.f33669e.startapp() + this.f33671e;
    }
}
