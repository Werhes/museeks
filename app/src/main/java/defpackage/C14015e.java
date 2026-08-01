package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14015e implements InterfaceC11094e {
    public final C5363e ad;
    public final C5363e license;
    public final C5891e metrica;
    public final C5363e vip;

    public C14015e(Function0 function0) {
        C14136e c14136e = new C14136e(11);
        C7068e c7068e = C7068e.f14512e;
        C14136e c14136e2 = new C14136e(12);
        this.ad = new C5363e(function0);
        this.vip = new C5363e(c14136e);
        C5891e c5891e = new C5891e(15);
        c5891e.f12440e = c7068e;
        c5891e.f12439e = C14914e.f29576e;
        this.metrica = c5891e;
        this.license = new C5363e(c14136e2);
    }

    @Override // defpackage.InterfaceC11094e
    public final InterfaceC7273e ad(Object obj, C6302e c6302e, C0624e c0624e) {
        C0388e c0388e = (C0388e) obj;
        if (!AbstractC7890e.billing(c0388e.metrica, "http") && !AbstractC7890e.billing(c0388e.metrica, "https")) {
            return null;
        }
        String str = c0388e.ad;
        C5363e c5363e = this.ad;
        C5363e c5363e2 = new C5363e(new C13465e(2, c0624e));
        C5363e c5363e3 = this.vip;
        C5891e c5891e = this.metrica;
        Context context = c6302e.ad;
        Object obj2 = c5891e.f12439e;
        C14914e c14914e = C14914e.f29576e;
        if (obj2 == c14914e) {
            synchronized (c5891e) {
                obj2 = c5891e.f12439e;
                if (obj2 == c14914e) {
                    Object invoke = ((Function1) c5891e.f12440e).invoke(context);
                    c5891e.f12439e = invoke;
                    c5891e.f12440e = null;
                    obj2 = invoke;
                }
            }
        }
        return new C2215e(str, c6302e, c5363e, c5363e2, c5363e3, new C12242e(obj2), this.license);
    }
}
