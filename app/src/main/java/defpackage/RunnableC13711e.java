package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC13711e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27158e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27159e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27160e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27161e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27162e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27163e;

    public RunnableC13711e(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC9026e interfaceC9026e, String str, String str2, boolean z) {
        this.f27158e = interfaceC9026e;
        this.f27160e = str;
        this.f27159e = str2;
        this.f27161e = z;
        this.f27163e = appMeasurementDynamiteService;
    }

    public RunnableC13711e(C8320e c8320e, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f27158e = atomicReference;
        this.f27160e = str;
        this.f27159e = str2;
        this.f27161e = z;
        Objects.requireNonNull(c8320e);
        this.f27163e = c8320e;
    }

    public RunnableC13711e(C8374e c8374e, boolean z, Uri uri, String str, String str2) {
        this.f27161e = z;
        this.f27158e = uri;
        this.f27160e = str;
        this.f27159e = str2;
        this.f27163e = c8374e;
    }

    public RunnableC13711e(C10640e c10640e, C8019e c8019e, boolean z, C3276e c3276e, Bundle bundle) {
        this.f27158e = c8019e;
        this.f27161e = z;
        this.f27160e = c3276e;
        this.f27159e = bundle;
        Objects.requireNonNull(c10640e);
        this.f27163e = c10640e;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:44:0x0152, B:47:0x016b, B:48:0x017a, B:50:0x0172, B:51:0x018d, B:53:0x0193, B:55:0x0199, B:57:0x019f, B:59:0x01a5, B:61:0x01ad, B:63:0x01b5, B:65:0x01bb, B:68:0x01cd, B:74:0x0094, B:76:0x009a, B:78:0x00a4, B:80:0x00aa, B:82:0x00b0, B:84:0x00b6, B:86:0x00be, B:88:0x00c6, B:90:0x00ce, B:92:0x00d6, B:93:0x00ec, B:95:0x00fa), top: B:73:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:44:0x0152, B:47:0x016b, B:48:0x017a, B:50:0x0172, B:51:0x018d, B:53:0x0193, B:55:0x0199, B:57:0x019f, B:59:0x01a5, B:61:0x01ad, B:63:0x01b5, B:65:0x01bb, B:68:0x01cd, B:74:0x0094, B:76:0x009a, B:78:0x00a4, B:80:0x00aa, B:82:0x00b0, B:84:0x00b6, B:86:0x00be, B:88:0x00c6, B:90:0x00ce, B:92:0x00d6, B:93:0x00ec, B:95:0x00fa), top: B:73:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC13711e.run():void");
    }
}
