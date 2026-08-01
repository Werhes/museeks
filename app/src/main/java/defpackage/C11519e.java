package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11519e implements InterfaceC18435e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C11519e f23146e = new C11519e();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f23147e = AbstractC9743e.vip();

    public static void ad(Activity activity, String str, String str2, File file) {
        Uri license = file != null ? Build.VERSION.SDK_INT >= 24 ? FileProvider.license(activity, file) : Uri.fromFile(file) : null;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.TITLE", str2);
        intent.setDataAndType(license, "text/plain");
        if (license != null) {
            intent.setClipData(ClipData.newRawUri(null, license));
        }
        intent.setFlags(1);
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share)));
    }

    public static String appmetrica(CatalogArtist catalogArtist) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(AbstractC7205e.metrica);
        sb.append("/music/artist/");
        String str = catalogArtist.metrica;
        if (str == null) {
            str = catalogArtist.vip;
        }
        sb.append(str);
        return sb.toString();
    }

    public static void vip(Activity activity, String str, String str2, String str3) {
        if (str3 == null || str3.length() == 0) {
            ad(activity, str, str2, null);
            return;
        }
        InterfaceC12732e ad = AbstractC16550e.ad(activity);
        C5944e c5944e = new C5944e(activity);
        c5944e.metrica = str3;
        c5944e.license = new C2532e(activity, str, str2, activity, str, str2);
        ((C0624e) ad).ad(c5944e.ad());
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f23147e.f29359e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(android.content.Context r6, android.graphics.Bitmap r7, defpackage.AbstractC10731e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C5612e
            if (r0 == 0) goto L13
            r0 = r8
            eؘّْ r0 = (defpackage.C5612e) r0
            int r1 = r0.f11974e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11974e = r1
            goto L18
        L13:
            eؘّْ r0 = new eؘّْ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f11972e
            int r1 = r0.f11974e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.io.File r6 = r0.f11973e
            defpackage.AbstractC2003e.purchase(r8)
            return r6
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r8)
            java.io.File r8 = new java.io.File
            java.io.File r6 = r6.getCacheDir()
            java.lang.String r1 = "augshare_cache.jpg"
            r8.<init>(r6, r1)
            eّٕٓ r6 = defpackage.AbstractC6731e.ad
            eؕۙۜ r6 = defpackage.ExecutorC3603e.f8134e
            eُؗٓ r1 = new eُؗٓ
            r3 = 2
            r4 = 0
            r1.<init>(r8, r7, r4, r3)
            r0.f11973e = r8
            r0.f11974e = r2
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r6, r1, r0)
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r6 != r7) goto L55
            return r7
        L55:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11519e.metrica(android.content.Context, android.graphics.Bitmap, eُؑ۠):java.lang.Object");
    }
}
