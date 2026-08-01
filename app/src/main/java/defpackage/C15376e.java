package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15376e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f30304e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ int f30305e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ int f30306e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8653e f30307e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3886e f30308e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ long f30309e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4993e f30310e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f30311e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C14544e f30312e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14856e f30313e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ int f30314e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14856e f30315e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15376e(long j, boolean z, C8653e c8653e, C14856e c14856e, int i, int i2, InterfaceC3886e interfaceC3886e, C14544e c14544e, int i3, int i4, long j2, C4993e c4993e) {
        super(11);
        this.f30316e = z;
        this.f30315e = c14856e;
        this.f30311e = i;
        this.f30314e = i2;
        this.f30308e = interfaceC3886e;
        this.f30312e = c14544e;
        this.f30306e = i3;
        this.f30305e = i4;
        this.f30309e = j2;
        this.f30310e = c4993e;
        this.f30307e = c8653e;
        this.f30313e = c14856e;
        this.f30304e = AbstractC2278e.vip(0, z ? C5602e.yandex(j) : Integer.MAX_VALUE, 0, z ? Alert.DURATION_SHOW_INDEFINITELY : C5602e.billing(j), 5);
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٕؓۥ */
    public final InterfaceC8848e mo760e(int i, int i2, int i3, long j) {
        return m3935e(i, j);
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final C3225e m3935e(int i, long j) {
        C8653e c8653e = this.f30307e;
        Object vip = c8653e.vip(i);
        Object metrica = c8653e.vip.metrica(i);
        return new C3225e(i, m4620e(this.f30313e, i, j), this.f30316e, this.f30308e, this.f30312e, this.f30315e.f29400e.getLayoutDirection(), this.f30306e, this.f30305e, i == this.f30311e + (-1) ? 0 : this.f30314e, this.f30309e, vip, metrica, this.f30310e.loadAd, j);
    }
}
