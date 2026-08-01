package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import j$.util.Objects;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17202e {
    public static final C2892e ad = new C2892e(232015063, false, new C2131e(28));
    public static final C2892e vip = new C2892e(-635909478, false, new C2131e(29));
    public static final C2892e metrica = new C2892e(1648785692, false, new C8453e(0));
    public static final C2892e license = new C2892e(1967235705, false, new C13428e(9));
    public static final C2892e appmetrica = new C2892e(407048792, false, new C13428e(10));

    public static final void ad(InterfaceC12864e interfaceC12864e, AbstractC4455e abstractC4455e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-714464401);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(abstractC4455e) ? 32 : 16;
        }
        int i3 = i & 384;
        C2892e c2892e2 = AbstractC0853e.ad;
        if (i3 == 0) {
            i2 |= c13770e.yandex(c2892e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                Object c0576e = new C0576e(null, C10990e.f21771e);
                c13770e.m3682throws(c0576e);
                m3681throw = c0576e;
            }
            C16711e vip2 = vip(c2892e2, c13770e, (i2 >> 6) & 14);
            AbstractC1101e.ad(abstractC4455e.ad(vip2), AbstractC16653e.license(274270255, new C6409e((Object) interfaceC12864e, (InterfaceC3314e) m3681throw, (Object) c2892e, (Object) vip2, 4), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 2, interfaceC12864e, abstractC4455e, c2892e);
        }
    }

    public static final int appmetrica(long j, long j2) {
        return AbstractC7890e.startapp(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final C9553e license(boolean z) {
        if (!z) {
            long vip2 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent));
            long vip3 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent));
            long vip4 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_page));
            long vip5 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_page));
            long vip6 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.text_primary));
            long vip7 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.text_secondary));
            long vip8 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary));
            long vip9 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.text_inverse));
            long vip10 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.scrim_color));
            long vip11 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.scrim_color));
            long vip12 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_page));
            long vip13 = C3618e.vip(0.19f, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent)));
            long vip14 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent));
            return AbstractC7893e.purchase(vip2, vip12, C3618e.vip(0.25f, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent))), vip3, vip13, vip14, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.nextdock_background)), vip4, vip5, vip6, vip8, vip7, vip9, vip10, vip11, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), 869815896, 65528);
        }
        long vip15 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent));
        long vip16 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent));
        long vip17 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_page));
        long vip18 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_page));
        long vip19 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.text_primary));
        long vip20 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.text_secondary));
        long vip21 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary));
        long vip22 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.text_inverse));
        long j = C3618e.appmetrica;
        long billing = AbstractC6532e.billing(C3618e.vip(0.1f, j), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)));
        long billing2 = AbstractC6532e.billing(C3618e.vip(0.1f, j), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)));
        long vip23 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_page));
        long vip24 = C3618e.vip(0.19f, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent)));
        long vip25 = AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent));
        return AbstractC7893e.metrica(vip15, vip23, C3618e.vip(0.25f, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.global_accent))), vip16, vip24, vip25, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.nextdock_background)), vip17, vip18, vip19, vip21, vip20, vip22, billing, billing2, AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), AbstractC6532e.vip(AbstractC15933e.ad(R.attr.bg_primary)), 869815896, 65528);
    }

    public static int metrica(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, AbstractC14204e.tapsense(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final double purchase(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final C16711e vip(C2892e c2892e, C13770e c13770e, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && c13770e.purchase(c2892e)) || (i & 6) == 4;
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (z || m3681throw == obj) {
            m3681throw = new C16711e(c2892e);
            c13770e.m3682throws(m3681throw);
        }
        C16711e c16711e = (C16711e) m3681throw;
        boolean purchase = c13770e.purchase(c16711e);
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase || m3681throw2 == obj) {
            m3681throw2 = new C0609e(14, c16711e);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.vip(c16711e, (Function1) m3681throw2, c13770e);
        return c16711e;
    }
}
