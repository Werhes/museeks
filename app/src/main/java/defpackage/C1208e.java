package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٝٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208e extends AbstractC16997e {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final /* synthetic */ int f3836e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f3837e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C12510e f3838e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f3839e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f3840e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C10250e f3841e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C5363e f3842e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C3168e f3843e;

    public C1208e(C12510e c12510e) {
        super(false, 3);
        this.f3838e = c12510e;
        this.f3840e = AbstractC14533e.startapp(null);
        this.f3843e = new C3168e(new C0609e(7, this));
        Boolean bool = Boolean.FALSE;
        this.f3837e = AbstractC14533e.startapp(bool);
        this.f3839e = AbstractC14533e.startapp(bool);
        this.f3841e = new C10250e(new C13301e(this, null, 29));
        this.f3842e = new C5363e(new C14515e(10, this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1208e(ua.itaysonlab.vkapi2.objects.music.AudioTrack r7) {
        /*
            r6 = this;
            eّٖٔ r0 = new eّٖٔ
            java.lang.String r1 = defpackage.AbstractC6914e.billing(r7)
            java.lang.String r2 = r7.license
            java.lang.String r3 = r7.ad
            ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum r4 = r7.amazon
            if (r4 == 0) goto L15
            ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb r4 = r4.appmetrica
            if (r4 == 0) goto L15
            java.lang.String r4 = r4.metrica
            goto L16
        L15:
            r4 = 0
        L16:
            java.lang.String r5 = r7.adcel
            r0.<init>(r1, r2, r3, r4, r5)
            r6.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1208e.<init>(ua.itaysonlab.vkapi2.objects.music.AudioTrack):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v0, types: [eٌَٗ] */
    /* JADX WARN: Type inference failed for: r8v5, types: [eٌّؒ, eٔؐۜ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eٌَٗ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object isVip(defpackage.C1208e r25, defpackage.AbstractC10731e r26) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1208e.isVip(eؒٝٞ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC5004e
    public final void admob() {
        super.admob();
        ((Cpackage) inmobi()).loadAd();
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        this.f3843e.isVip(vKXApplication.getApplicationContext());
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        ((Cpackage) inmobi()).loadAd();
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        this.f3843e.isVip(vKXApplication.getApplicationContext());
        ((C17148e) inmobi()).release();
    }

    public final InterfaceC12406e inmobi() {
        return (InterfaceC12406e) this.f3842e.getValue();
    }

    @Override // defpackage.AbstractC5004e
    public final void subscription() {
        super.subscription();
        ((Cpackage) inmobi()).pro();
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        this.f3843e.m1250e(vKXApplication.getApplicationContext());
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-408907631);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C15238e(this, null, 7);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            if (((Boolean) this.f3839e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-1239753333);
                AbstractC15946e.ad(c13770e, 0);
            } else {
                c13770e.m3676strictfp(-1244877199);
            }
            c13770e.Signature(false);
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-385860372, new C11027e(this), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11027e(this, i);
        }
    }
}
