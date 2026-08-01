package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۨۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6094e {
    public final String ad;
    public final C14826e appmetrica;
    public volatile C7576e billing;
    public final Function1 license;
    public final C17974e metrica;
    public final Object purchase = new Object();
    public final C2362e vip;

    public C6094e(String str, C2362e c2362e, C17974e c17974e, Function1 function1, C14826e c14826e) {
        this.ad = str;
        this.vip = c2362e;
        this.metrica = c17974e;
        this.license = function1;
        this.appmetrica = c14826e;
    }

    public final Object ad(Object obj) {
        C7576e c7576e;
        Context context = (Context) obj;
        C7576e c7576e2 = this.billing;
        if (c7576e2 != null) {
            return c7576e2;
        }
        synchronized (this.purchase) {
            try {
                if (this.billing == null) {
                    Context applicationContext = context.getApplicationContext();
                    C17643e c17643e = new C17643e(AbstractC11062e.f21949e, this.vip, new C5625e(this, applicationContext, 8));
                    InterfaceC8850e interfaceC8850e = this.appmetrica.f29359e;
                    C13664e c13664e = C13664e.f27089e;
                    this.billing = new C7576e(c17643e, Collections.singletonList(new C15966e(AbstractC13480e.m3584final(c13664e, (List) this.license.invoke(applicationContext)), (InterfaceC5083e) null, 6)), this.metrica, interfaceC8850e);
                }
                c7576e = this.billing;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7576e;
    }
}
