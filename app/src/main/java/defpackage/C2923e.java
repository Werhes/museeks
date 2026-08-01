package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۡۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2923e extends AbstractC8276e {
    public final Context ad;
    public String license;
    public final Object metrica = new Object();
    public final C4504e vip = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؖۦٍ] */
    public C2923e(C17214e c17214e) {
        this.ad = c17214e.ad;
    }

    @Override // defpackage.InterfaceC1312e
    public final C10005e ad(Uri uri) {
        if (yandex(uri)) {
            throw new IOException("Android backend cannot perform remote operations without a remote backend");
        }
        File Signature = AbstractC6100e.Signature(billing(uri));
        return new C10005e(new FileInputStream(Signature), Signature);
    }

    @Override // defpackage.AbstractC8276e
    public final Uri billing(Uri uri) {
        if (yandex(uri)) {
            throw new IOException("Operation across authorities is not allowed.");
        }
        File metrica = metrica(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority(BuildConfig.FLAVOR).path("/");
        C13304e Signature = AbstractC17475e.Signature();
        path.path(metrica.getAbsolutePath());
        C1410e billing = Signature.billing();
        Pattern pattern = AbstractC2620e.ad;
        return path.encodedFragment(billing.isEmpty() ? null : "transform=".concat(String.valueOf(new C7364e("+").appmetrica(billing)))).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
    @Override // defpackage.InterfaceC1312e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File metrica(android.net.Uri r10) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2923e.metrica(android.net.Uri):java.io.File");
    }

    @Override // defpackage.InterfaceC1312e
    public final String startapp() {
        return "android";
    }

    @Override // defpackage.InterfaceC1312e
    public final boolean vip(Uri uri) {
        if (yandex(uri)) {
            throw new IOException("Android backend cannot perform remote operations without a remote backend");
        }
        return AbstractC6100e.Signature(billing(uri)).exists();
    }

    public final boolean yandex(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.ad.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
