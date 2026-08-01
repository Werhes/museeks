package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12789e extends AbstractC2753e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2753e f25592e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f25593e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f25594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12789e(AbstractC2753e abstractC2753e, int i, int i2) {
        super(1);
        this.f25592e = abstractC2753e;
        this.f25594e = i;
        this.f25593e = i2;
    }

    @Override // defpackage.AbstractC2753e, java.util.List
    /* renamed from: Signature */
    public final AbstractC2753e subList(int i, int i2) {
        AbstractC0223e.amazon(i, i2, this.f25593e);
        int i3 = this.f25594e;
        return this.f25592e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.AbstractC10054e
    public final int adcel() {
        return this.f25592e.startapp() + this.f25594e + this.f25593e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0223e.smaato(i, this.f25593e);
        return this.f25592e.get(i + this.f25594e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25593e;
    }

    @Override // defpackage.AbstractC10054e
    public final int startapp() {
        return this.f25592e.startapp() + this.f25594e;
    }

    @Override // defpackage.AbstractC10054e
    public final Object[] yandex() {
        return this.f25592e.yandex();
    }
}
