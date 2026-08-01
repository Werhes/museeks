package defpackage;

import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6762e implements InterfaceC10801e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final StackTraceElement[] f13967e = new StackTraceElement[0];

    public static final InterfaceC12864e license(float f) {
        C0115e c0115e = C0115e.f1276e;
        return (f == 1.0f && f == 1.0f) ? c0115e : AbstractC12546e.startapp(c0115e, f, f, 0.0f, 0.0f, null, false, 524284);
    }

    public static final C16427e metrica(String str, int i, int i2, InterfaceC7227e interfaceC7227e, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        if (interfaceC7227e != null) {
            InterfaceC3055e ad = AbstractC2863e.ad(interfaceC7227e);
            if (ad == null || (str3 = ad.ad()) == null) {
                throw new IllegalStateException(AbstractC17861e.Signature("Could not find RealmObjectCompanion for: ", interfaceC7227e.license()));
            }
        } else {
            str3 = null;
        }
        int i3 = (z ? 1 : 0) | (z2 ? 2 : 0) | (z3 ? 4 : 0);
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        return new C16427e(str, BuildConfig.FLAVOR, i, i2, str3, str2, ((C1235e) AbstractC15871e.vip.getValue()).ad, i3);
    }

    public static final C7694e vip(Function0 function0, C13770e c13770e) {
        c13770e.m3672private(-242680581);
        c13770e.m3672private(-1287793883);
        String valueOf = String.valueOf(AbstractC5546e.appmetrica(c13770e));
        c13770e.Signature(false);
        C7694e c7694e = new C7694e(valueOf, function0);
        c13770e.Signature(false);
        return c7694e;
    }
}
