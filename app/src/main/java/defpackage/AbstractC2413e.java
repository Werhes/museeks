package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2413e {
    public static final C2892e ad = new C2892e(-1381980787, false, new C14123e(11));

    public static final void ad(final Function0 function0, long j, final C18280e c18280e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        C18280e c18280e2;
        final EnumC7792e enumC7792e;
        boolean z;
        boolean z2;
        long j2 = j;
        c13770e.m3671package(-85756322);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.appmetrica(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            c18280e2 = c18280e;
            i2 |= c13770e.purchase(c18280e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            c18280e2 = c18280e;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 2048 : 1024;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            View view = (View) c13770e.adcel(AbstractC2676e.purchase);
            InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
            EnumC7792e enumC7792e2 = (EnumC7792e) c13770e.adcel(AbstractC11473e.amazon);
            C14725e billing = AbstractC5546e.billing(c13770e);
            InterfaceC3314e mopub = AbstractC14533e.mopub(c2892e, c13770e);
            Object[] objArr = new Object[0];
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = new C14136e(9);
                c13770e.m3682throws(m3681throw);
            }
            UUID uuid = (UUID) AbstractC10510e.license(objArr, (Function0) m3681throw, c13770e);
            boolean purchase = c13770e.purchase(view) | c13770e.purchase(interfaceC14388e);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == obj) {
                enumC7792e = enumC7792e2;
                z = true;
                z2 = false;
                DialogC5439e dialogC5439e = new DialogC5439e(function0, c18280e2, j2, view, enumC7792e, interfaceC14388e, uuid);
                j2 = j2;
                C2892e c2892e2 = new C2892e(1379699857, true, new C5776e(mopub, 8));
                C16832e c16832e = dialogC5439e.f11705e;
                c16832e.setParentCompositionContext(billing);
                c16832e.f32969e.setValue(c2892e2);
                c16832e.f32970e = true;
                c16832e.license();
                c13770e.m3682throws(dialogC5439e);
                m3681throw2 = dialogC5439e;
            } else {
                enumC7792e = enumC7792e2;
                z = true;
                z2 = false;
            }
            final DialogC5439e dialogC5439e2 = (DialogC5439e) m3681throw2;
            boolean yandex = c13770e.yandex(dialogC5439e2);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == obj) {
                m3681throw3 = new C6846e(8, dialogC5439e2);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC17680e.vip(dialogC5439e2, (Function1) m3681throw3, c13770e);
            boolean yandex2 = c13770e.yandex(dialogC5439e2) | ((i3 & 14) == 4 ? z : z2) | ((i3 & 896) == 256 ? z : z2);
            if ((((i3 & 112) ^ 48) <= 32 || !c13770e.appmetrica(j2)) && (i3 & 48) != 32) {
                z = z2;
            }
            boolean license = yandex2 | z | c13770e.license(enumC7792e.ordinal());
            Object m3681throw4 = c13770e.m3681throw();
            if (license || m3681throw4 == obj) {
                final long j3 = j2;
                Object obj2 = new Function0() { // from class: eَؚۧ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        DialogC5439e.this.billing(function0, c18280e, j3, enumC7792e);
                        return Unit.INSTANCE;
                    }
                };
                c13770e.m3682throws(obj2);
                m3681throw4 = obj2;
            }
            AbstractC17680e.purchase((Function0) m3681throw4, c13770e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4939e(function0, j, c18280e, c2892e, i);
        }
    }

    public static boolean appmetrica(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static C2414e metrica(InterfaceC9660e interfaceC9660e, String str, byte[] bArr, Map map) {
        C2435e c2435e;
        C0534e c0534e;
        Map map2;
        List list;
        byte[] vip;
        C9344e c9344e = new C9344e(interfaceC9660e);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        AbstractC2301e.amazon(parse, "The uri must be set.");
        C2435e c2435e2 = new C2435e(parse, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        C2435e c2435e3 = c2435e2;
        int i = 0;
        while (true) {
            try {
                C0534e c0534e2 = new C0534e(c9344e, c2435e3);
                try {
                    vip = AbstractC15517e.vip(c0534e2);
                } catch (C16254e e) {
                    e = e;
                    c2435e = c2435e2;
                    c0534e = c0534e2;
                } catch (Throwable th) {
                    th = th;
                    c0534e = c0534e2;
                }
                try {
                    c2435e = c2435e2;
                    c0534e = c0534e2;
                    try {
                        try {
                            C6913e c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, SystemClock.elapsedRealtime(), 0L, vip.length);
                            C3168e c3168e = new C3168e(2, vip);
                            c3168e.f7272e = c6913e;
                            C2414e c2414e = new C2414e(c3168e);
                            AbstractC9413e.yandex(c0534e);
                            return c2414e;
                        } catch (C16254e e2) {
                            e = e2;
                            int i2 = e.f31932e;
                            String str2 = null;
                            if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.f31933e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                                str2 = (String) list.get(0);
                            }
                            if (str2 == null) {
                                throw e;
                            }
                            i++;
                            C11537e ad2 = c2435e3.ad();
                            ad2.ad = Uri.parse(str2);
                            c2435e3 = ad2.ad();
                            try {
                                AbstractC9413e.yandex(c0534e);
                                c2435e2 = c2435e;
                            } catch (Exception e3) {
                                e = e3;
                                throw new C4456e(c2435e, c9344e.f18614e, c9344e.f18617e.advert(), c9344e.f18615e, e);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC9413e.yandex(c0534e);
                        throw th;
                    }
                } catch (C16254e e4) {
                    e = e4;
                    c2435e = c2435e2;
                    c0534e = c0534e2;
                } catch (Throwable th3) {
                    th = th3;
                    c0534e = c0534e2;
                    AbstractC9413e.yandex(c0534e);
                    throw th;
                }
                c2435e2 = c2435e;
            } catch (Exception e5) {
                e = e5;
                c2435e = c2435e2;
            }
        }
    }

    public static boolean purchase(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eًٍِ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eَۥۧ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eؕۘۘ] */
    /* JADX WARN: Type inference failed for: r7v4, types: [eَۥۧ] */
    /* JADX WARN: Type inference failed for: r7v5, types: [eَۥۧ] */
    /* JADX WARN: Type inference failed for: r7v6, types: [eٗۨٗ, eَۥۧ] */
    public static C11603e vip(C2637e c2637e) {
        ?? c10658e;
        ?? c11603e = new C11603e(true);
        for (int i = 0; i < EnumC6816e.values().length; i++) {
            EnumC6816e enumC6816e = EnumC6816e.values()[i];
            C1781e c1781e = (C1781e) c2637e.vip(enumC6816e.f14045e, C1781e.class);
            if (c1781e == null) {
                c1781e = (C1781e) ((C12234e) c2637e.vip(C7056e.startapp, C12234e.class)).vip(enumC6816e.f14045e, C1781e.class);
            }
            if (c1781e != null) {
                Iterator it = c1781e.appmetrica().iterator();
                while (it.hasNext()) {
                    C8905e c8905e = (C8905e) it.next();
                    int i2 = c8905e.f17869e;
                    String str = c8905e.f17871e;
                    if (i2 == 1) {
                        EnumC3488e enumC3488e = EnumC3488e.f7852e;
                        if (str.equals(enumC3488e.f7919e)) {
                            c10658e = new C10658e(c8905e);
                            if (!str.equals(enumC3488e.f7919e)) {
                                throw new IllegalArgumentException("Descriptor description must be WM/Picture");
                            }
                            if (c8905e.f17869e != 1) {
                                throw new IllegalArgumentException("Descriptor type must be binary");
                            }
                            try {
                                c10658e.ad();
                            } catch (UnsupportedEncodingException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            c10658e = str.equals(EnumC3488e.f7900e.f7919e) ? new C10658e(c8905e) : new C10658e(c8905e);
                        }
                    } else {
                        c10658e = new C10658e(c8905e);
                        if (c8905e.f17869e == 1) {
                            throw new IllegalArgumentException("Cannot interpret binary as string.");
                        }
                    }
                    c11603e.purchase(c10658e);
                }
            }
        }
        return c11603e;
    }

    public abstract AbstractC9932e billing(int i);

    public abstract int license();

    public abstract AbstractC9932e yandex(int i);
}
