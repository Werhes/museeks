package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۛؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2081e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f5401e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C1028e f5402e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ int f5403e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5404e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ long f5405e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14856e f5406e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ int f5407e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C8202e f5408e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14856e f5409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2081e(C1028e c1028e, C14856e c14856e, int i, C8202e c8202e, boolean z, int i2, int i3, long j) {
        super(11);
        this.f5409e = c14856e;
        this.f5408e = c8202e;
        this.f5404e = z;
        this.f5407e = i2;
        this.f5403e = i3;
        this.f5405e = j;
        this.f5402e = c1028e;
        this.f5406e = c14856e;
        this.f5401e = i;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final InterfaceC8848e mo760e(int i, int i2, int i3, long j) {
        return m761e(i, i2, i3, this.f5401e, j);
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final C6564e m761e(int i, int i2, int i3, int i4, long j) {
        int startapp;
        C1028e c1028e = this.f5402e;
        Object vip = c1028e.vip(i);
        Object metrica = c1028e.vip.metrica(i);
        List m4620e = m4620e(this.f5406e, i, j);
        if (C5602e.purchase(j)) {
            startapp = C5602e.adcel(j);
        } else {
            if (!C5602e.appmetrica(j)) {
                AbstractC8889e.ad("does not have fixed height");
            }
            startapp = C5602e.startapp(j);
        }
        EnumC7792e layoutDirection = this.f5409e.f29400e.getLayoutDirection();
        C2245e c2245e = this.f5408e.smaato;
        int i5 = this.f5403e;
        long j2 = this.f5405e;
        return new C6564e(i, vip, this.f5404e, startapp, i4, layoutDirection, this.f5407e, i5, m4620e, j2, metrica, c2245e, j, i2, i3);
    }
}
