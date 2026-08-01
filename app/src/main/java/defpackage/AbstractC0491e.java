package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0491e {
    public static final C15492e ad = new AbstractC4455e(new C14136e(26));
    public static final C9375e vip = new C9375e(14);

    public static final void ad(C0765e c0765e, Context context, boolean z, CharSequence charSequence, C12347e c12347e, InterfaceC3358e interfaceC3358e, Function1 function1) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && c12347e != null && interfaceC3358e != null && (interfaceC3358e instanceof C13189e)) {
            ((C13189e) interfaceC3358e).vip(c0765e, charSequence, c12347e.ad, function1);
            AbstractC10115e.vip(c0765e, context, z, charSequence, c12347e.ad);
            return;
        }
        function1.invoke(c0765e);
        if (charSequence == null || c12347e == null) {
            return;
        }
        AbstractC10115e.vip(c0765e, context, z, charSequence, c12347e.ad);
    }

    public static final InterfaceC3358e vip(EnumC4478e enumC4478e, C4622e c4622e, C13770e c13770e, int i) {
        c13770e.m3676strictfp(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            c13770e.Signature(false);
            return null;
        }
        Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
        InterfaceC8850e interfaceC8850e = (InterfaceC8850e) c13770e.adcel(ad);
        boolean purchase = ((((i & 112) ^ 48) > 32 && c13770e.purchase(c4622e)) || (i & 48) == 32) | c13770e.purchase(interfaceC8850e) | c13770e.purchase(context);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            vip.getClass();
            m3681throw = new C13189e(interfaceC8850e, context, enumC4478e, c4622e);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3358e interfaceC3358e = (InterfaceC3358e) m3681throw;
        c13770e.Signature(false);
        return interfaceC3358e;
    }
}
