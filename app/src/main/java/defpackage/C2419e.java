package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2419e implements InterfaceC4417e {
    public final InterfaceC8850e ad;
    public final String appmetrica;
    public final C17651e billing;
    public final String license;
    public final C14578e metrica;
    public final String purchase;
    public final C5363e startapp;
    public final File vip;
    public final C5363e yandex;

    public C2419e(InterfaceC8850e interfaceC8850e, File file) {
        this.ad = interfaceC8850e;
        this.vip = file;
        Object obj = FileObserverC10859e.vip;
        final int i = 1;
        this.metrica = new C14578e(new C8857e(file, null, 27), C2693e.f6576e, -2, 1);
        this.license = ".lock";
        this.appmetrica = ".version";
        this.purchase = "fcntl failed: EAGAIN";
        this.billing = AbstractC12751e.ad();
        final int i2 = 0;
        this.yandex = new C5363e(new Function0(this) { // from class: eٍؘْ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C2419e f11970e;

            {
                this.f11970e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ParcelFileDescriptor parcelFileDescriptor;
                switch (i2) {
                    case 0:
                        C2419e c2419e = this.f11970e;
                        File file2 = new File(c2419e.vip.getAbsolutePath() + c2419e.license);
                        C2419e.purchase(file2);
                        return file2;
                    default:
                        InterfaceC0740e.ad.getClass();
                        C2419e c2419e2 = this.f11970e;
                        File file3 = new File(c2419e2.vip.getAbsolutePath() + c2419e2.appmetrica);
                        C2419e.purchase(file3);
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                C10520e ad = C7272e.ad(parcelFileDescriptor);
                                parcelFileDescriptor.close();
                                return ad;
                            } catch (Throwable th) {
                                th = th;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
        this.startapp = new C5363e(new Function0(this) { // from class: eٍؘْ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C2419e f11970e;

            {
                this.f11970e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ParcelFileDescriptor parcelFileDescriptor;
                switch (i) {
                    case 0:
                        C2419e c2419e = this.f11970e;
                        File file2 = new File(c2419e.vip.getAbsolutePath() + c2419e.license);
                        C2419e.purchase(file2);
                        return file2;
                    default:
                        InterfaceC0740e.ad.getClass();
                        C2419e c2419e2 = this.f11970e;
                        File file3 = new File(c2419e2.vip.getAbsolutePath() + c2419e2.appmetrica);
                        C2419e.purchase(file3);
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                C10520e ad = C7272e.ad(parcelFileDescriptor);
                                parcelFileDescriptor.close();
                                return ad;
                            } catch (Throwable th) {
                                th = th;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
    }

    public static void purchase(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // defpackage.InterfaceC4417e
    public final Object ad(AbstractC10731e abstractC10731e) {
        C5363e c5363e = this.startapp;
        if (c5363e.ad()) {
            C10520e c10520e = (C10520e) ((InterfaceC0740e) c5363e.getValue());
            return new Integer(c10520e.vip.nativeGetCounterValue(c10520e.metrica));
        }
        return AbstractC5336e.advert(this.ad, new C9352e(this, null, 0), abstractC10731e);
    }

    @Override // defpackage.InterfaceC4417e
    public final InterfaceC1108e appmetrica() {
        return this.metrica;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:15:0x00de, B:24:0x00f9, B:25:0x00fc), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:15:0x00de, B:24:0x00f9, B:25:0x00fc), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, eؘۖۜ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.InterfaceC4417e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(kotlin.jvm.functions.Function2 r19, defpackage.AbstractC10731e r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2419e.license(kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4417e
    public final Object metrica(C4091e c4091e) {
        C5363e c5363e = this.startapp;
        if (c5363e.ad()) {
            C10520e c10520e = (C10520e) ((InterfaceC0740e) c5363e.getValue());
            return new Integer(c10520e.vip.nativeIncrementAndGetCounterValue(c10520e.metrica));
        }
        return AbstractC5336e.advert(this.ad, new C9352e(this, null, 1), c4091e);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5 A[Catch: all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00c9, blocks: (B:16:0x00c5, B:30:0x00e9, B:31:0x00ec), top: B:7:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #6 {all -> 0x00c9, blocks: (B:16:0x00c5, B:30:0x00e9, B:31:0x00ec), top: B:7:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7, types: [eؚؗؔ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    @Override // defpackage.InterfaceC4417e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(kotlin.jvm.functions.Function1 r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2419e.vip(kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }
}
