package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8303e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C14856e f16979e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f16980e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11842e f16981e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C4036e f16982e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0085e f16983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8303e(C4036e c4036e, boolean z, C11842e c11842e, C14856e c14856e, C0085e c0085e) {
        super(11);
        this.f16982e = c4036e;
        this.f16980e = z;
        this.f16981e = c11842e;
        this.f16979e = c14856e;
        this.f16983e = c0085e;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٕؓۥ */
    public final InterfaceC8848e mo760e(int i, int i2, int i3, long j) {
        C11842e c11842e = this.f16981e;
        Object vip = c11842e.vip(i);
        Object metrica = c11842e.vip.metrica(i);
        List m4620e = m4620e(this.f16979e, i, j);
        C4036e c4036e = this.f16982e;
        return new C13668e(i, vip, m4620e, c4036e.purchase, c4036e.advert, i2, i3, c4036e.adcel, c4036e.mopub, metrica, c4036e.ad.pro, j);
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final C13668e m2396e(int i, long j) {
        int i2;
        long yandex;
        C11842e c11842e = this.f16981e;
        Object vip = c11842e.vip(i);
        Object metrica = c11842e.vip.metrica(i);
        C0085e c0085e = this.f16983e;
        int[] iArr = c0085e.vip;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = c0085e.ad;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.f16980e) {
            if (i2 < 0) {
                AbstractC15805e.ad("width must be >= 0");
            }
            yandex = AbstractC2278e.yandex(i2, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
        } else {
            if (i2 < 0) {
                AbstractC15805e.ad("height must be >= 0");
            }
            yandex = AbstractC2278e.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, i2, i2);
        }
        long j2 = yandex;
        List m4620e = m4620e(this.f16979e, i, j2);
        C4036e c4036e = this.f16982e;
        return new C13668e(i, vip, m4620e, c4036e.purchase, c4036e.advert, i4, i5, c4036e.adcel, c4036e.mopub, metrica, c4036e.ad.pro, j2);
    }
}
