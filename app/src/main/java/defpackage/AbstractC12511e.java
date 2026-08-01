package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12511e {
    public static final boolean[] ad = new boolean[3];

    public static final void ad(C4034e c4034e, C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(-614342087);
        int i2 = (c13770e.yandex(c4034e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e.m3676strictfp(-1009319487);
            InterfaceC5083e interfaceC5083e = null;
            AbstractC13350e.vip(48, c2892e, c13770e, AbstractC1561e.billing(AbstractC15389e.billing(new C7236e(c4034e, interfaceC5083e, 15)), c4034e.billing, new C0593e(c4034e, interfaceC5083e, 5), null, new C16784e(c4034e, 3)));
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15284e(c4034e, c2892e, i, 0);
        }
    }

    public static final boolean appmetrica(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object billing(defpackage.C5042e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C12188e
            if (r0 == 0) goto L13
            r0 = r5
            eّؒ r0 = (defpackage.C12188e) r0
            int r1 = r0.f24483e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24483e = r1
            goto L18
        L13:
            eّؒ r0 = new eّؒ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f24481e
            int r1 = r0.f24483e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            eؗٝٝ r4 = r0.f24482e
            defpackage.AbstractC2003e.purchase(r5)
            goto L4f
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L30:
            defpackage.AbstractC2003e.purchase(r5)
            boolean r5 = r4 instanceof defpackage.C9788e
            if (r5 == 0) goto L38
            return r4
        L38:
            eؘٗٙ r5 = r4.f10750e
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            r5 = r3
        L3e:
            eْٕؕ r5 = r5.metrica()
            r0.f24482e = r4
            r0.f24483e = r2
            java.lang.Object r5 = defpackage.AbstractC11263e.tapsense(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L4f
            return r0
        L4f:
            eٜٗۧ r5 = (defpackage.InterfaceC17430e) r5
            r0 = -1
            byte[] r5 = defpackage.AbstractC12731e.license(r5, r0)
            eٍ۟ۜ r0 = new eٍ۟ۜ
            eٍُۘ r1 = r4.f10752e
            eَؖۜ r2 = r4.f10751e
            if (r2 == 0) goto L5f
            goto L60
        L5f:
            r2 = r3
        L60:
            eؘٗٙ r4 = r4.f10750e
            if (r4 == 0) goto L65
            r3 = r4
        L65:
            r0.<init>(r1, r2, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12511e.billing(eؗٝٝ, eُؑ۠):java.lang.Object");
    }

    public static void license(C17688e c17688e, C17677e c17677e, C11325e c11325e) {
        c11325e.loadAd = -1;
        C9399e c9399e = c11325e.f22764while;
        int[] iArr = c11325e.f22751public;
        C9399e c9399e2 = c11325e.f22759throw;
        C9399e c9399e3 = c11325e.f22746native;
        C9399e c9399e4 = c11325e.f22737extends;
        C9399e c9399e5 = c11325e.f22758this;
        c11325e.Signature = -1;
        int[] iArr2 = c17688e.f22751public;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c9399e5.billing;
            int admob = c17688e.admob() - c9399e4.billing;
            c9399e5.startapp = c17677e.mopub(c9399e5);
            c9399e4.startapp = c17677e.mopub(c9399e4);
            c17677e.license(c9399e5.startapp, i);
            c17677e.license(c9399e4.startapp, admob);
            c11325e.loadAd = 2;
            c11325e.f22754strictfp = i;
            int i2 = admob - i;
            c11325e.f22731catch = i2;
            int i3 = c11325e.f22761transient;
            if (i2 < i3) {
                c11325e.f22731catch = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c9399e3.billing;
        int mopub = c17688e.mopub() - c9399e2.billing;
        c9399e3.startapp = c17677e.mopub(c9399e3);
        c9399e2.startapp = c17677e.mopub(c9399e2);
        c17677e.license(c9399e3.startapp, i4);
        c17677e.license(c9399e2.startapp, mopub);
        if (c11325e.f22748package > 0 || c11325e.f22752return == 8) {
            C0511e mopub2 = c17677e.mopub(c9399e);
            c9399e.startapp = mopub2;
            c17677e.license(mopub2, c11325e.f22748package + i4);
        }
        c11325e.Signature = 2;
        c11325e.f22749private = i4;
        int i5 = mopub - i4;
        c11325e.f22738final = i5;
        int i6 = c11325e.f22743import;
        if (i5 < i6) {
            c11325e.f22738final = i6;
        }
    }

    public static final void metrica(C7765e c7765e, boolean z, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        InterfaceC12864e interfaceC12864e;
        c13770e.m3671package(-1442752422);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c7765e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            c13770e.m3676strictfp(-1299459355);
            if (z) {
                c13770e.m3676strictfp(-1299415211);
                boolean yandex = c13770e.yandex(c7765e);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == C2987e.ad) {
                    m3681throw = new C10516e(c7765e, null, 0);
                    c13770e.m3682throws(m3681throw);
                }
                interfaceC12864e = AbstractC15389e.billing((Function2) m3681throw);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1298836224);
                c13770e.Signature(false);
                interfaceC12864e = C0115e.f1276e;
            }
            AbstractC13350e.vip((i2 >> 3) & 112, c2892e, c13770e, interfaceC12864e);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C14247e(c7765e, z, c2892e, i, 0);
        }
    }

    public static final C6798e purchase(C7850e c7850e, C11709e c11709e, C16308e c16308e) {
        c7850e.getClass();
        String replace = c11709e.vip.ad.ad.replace('.', '$');
        C12816e c12816e = c11709e.ad;
        if (!c12816e.ad.metrica()) {
            replace = c12816e + '.' + replace;
        }
        C2691e signatures = c7850e.signatures(replace);
        if (signatures != null) {
            return (C6798e) signatures.f6570e;
        }
        return null;
    }

    public static void startapp(C13879e c13879e, SQLiteDatabase sQLiteDatabase) {
        if (c13879e == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        C14937e c14937e = c13879e.f27495e;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c14937e.ad("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c14937e.ad("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c14937e.ad("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c14937e.ad("Failed to turn on database write permission for owner");
    }

    public static final void vip(C15860e c15860e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        InterfaceC12864e billing;
        c13770e.m3671package(1533506138);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c15860e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e.m3676strictfp(-885604480);
            if (c15860e.mopub()) {
                InterfaceC5083e interfaceC5083e = null;
                billing = AbstractC1561e.billing(AbstractC15389e.billing(new C15769e(c15860e, interfaceC5083e, 0)), c15860e.inmobi, new C0593e(c15860e, interfaceC5083e, 7), new C6406e(c15860e, interfaceC5083e, 0), new C14842e(c15860e, 2));
            } else {
                billing = C0115e.f1276e;
            }
            AbstractC13350e.vip(i2 & 112, c2892e, c13770e, billing);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4225e(c15860e, c2892e, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:28:0x00bc->B:34:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:27:0x00ba, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void yandex(defpackage.C13879e r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12511e.yandex(eٍؙٓ, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
