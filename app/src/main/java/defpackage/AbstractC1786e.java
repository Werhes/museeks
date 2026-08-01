package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function2;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1786e {
    public static String Signature(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static void ad(InterfaceC4023e interfaceC4023e, Function2 function2) {
        for (Map.Entry entry : interfaceC4023e.mopub()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final boolean adcel(int i) {
        Boolean bool;
        if (AbstractC17852e.ad()) {
            try {
                int i2 = Conscrypt.ad;
                bool = (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                AbstractC17852e.ad.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static String admob(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String ads(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static int advert(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static long amazon(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static /* synthetic */ void applovin(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static boolean appmetrica(InterfaceC11810e interfaceC11810e) {
        return interfaceC11810e.appmetrica() == 2;
    }

    public static C13003e billing(InterfaceC10625e interfaceC10625e, byte[] bArr, int i) {
        C13304e Signature = AbstractC17475e.Signature();
        interfaceC10625e.mo825transient(bArr, 0, i, C14033e.metrica, new C2007e(13, Signature));
        return new C13003e(Signature.billing());
    }

    public static StringBuilder inmobi(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static void isPro(C13770e c13770e, boolean z, boolean z2, boolean z3) {
        c13770e.Signature(z);
        c13770e.Signature(z2);
        c13770e.Signature(z3);
    }

    public static String isVip(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static String license(InterfaceC12438e interfaceC12438e, String str) {
        return (String) interfaceC12438e.smaato(InterfaceC7775e.f15761e, str);
    }

    public static C14803e loadAd(int i, C13770e c13770e, boolean z) {
        c13770e.m3676strictfp(i);
        c13770e.Signature(z);
        return new C14803e(10);
    }

    public static String metrica(InterfaceC12438e interfaceC12438e) {
        return (String) interfaceC12438e.subscription(InterfaceC7775e.f15761e);
    }

    public static int mopub(int i, int i2, int i3) {
        return (AbstractC8703e.m2467class(i) + i2) * i3;
    }

    public static /* synthetic */ String premium(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static String pro(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static InterfaceC16522e purchase(InterfaceC16522e interfaceC16522e, InterfaceC16522e interfaceC16522e2) {
        boolean z = interfaceC16522e2 instanceof C14274e;
        if (!z || !(interfaceC16522e instanceof C14274e)) {
            return (!z || (interfaceC16522e instanceof C14274e)) ? (z || !(interfaceC16522e instanceof C14274e)) ? interfaceC16522e2.metrica(new C5671e(18, interfaceC16522e)) : interfaceC16522e : interfaceC16522e2;
        }
        C14274e c14274e = (C14274e) interfaceC16522e2;
        AbstractC9876e abstractC9876e = c14274e.ad;
        float f = c14274e.vip;
        if (Float.isNaN(f)) {
            f = ((C14274e) interfaceC16522e).vip;
        }
        return new C14274e(abstractC9876e, f);
    }

    public static String remoteconfig(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String signatures(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static int smaato(C1839e c1839e, int i, int i2) {
        return (c1839e.hashCode() + i) * i2;
    }

    public static final boolean startapp(int i) {
        return !AbstractC17852e.ad();
    }

    public static boolean subs(C3909e c3909e) {
        Iterator it = c3909e.metrica(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).vip()) {
                return true;
            }
        }
        return false;
    }

    public static String subscription(C12232e c12232e, Class cls, StringBuilder sb) {
        sb.append(c12232e.vip(cls));
        return sb.toString();
    }

    public static String tapsense(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static Executor vip(InterfaceC1927e interfaceC1927e, ExecutorC3044e executorC3044e) {
        return (Executor) interfaceC1927e.smaato(InterfaceC1927e.f5123e, executorC3044e);
    }

    public static final void yandex(int i, View view, ViewGroup viewGroup) {
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (AbstractC15958e.m4045native(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (m2467class == 1) {
            if (AbstractC15958e.m4045native(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (AbstractC15958e.m4045native(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (m2467class == 2) {
            if (AbstractC15958e.m4045native(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (m2467class != 3) {
            return;
        }
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
