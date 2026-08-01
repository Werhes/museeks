package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۢۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11354e {
    public final String ad;
    public final Object appmetrica = new Object();
    public final C14826e license;
    public final Function1 metrica;
    public volatile C4846e purchase;
    public final C17974e vip;

    public C11354e(String str, C17974e c17974e, Function1 function1, C14826e c14826e) {
        this.ad = str;
        this.vip = c17974e;
        this.metrica = function1;
        this.license = c14826e;
    }

    public final Object ad(Object obj) {
        C4846e c4846e;
        Context context = (Context) obj;
        C4846e c4846e2 = this.purchase;
        if (c4846e2 != null) {
            return c4846e2;
        }
        synchronized (this.appmetrica) {
            try {
                if (this.purchase == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC9452e interfaceC9452e = this.vip;
                    List list = (List) this.metrica.invoke(applicationContext);
                    C14826e c14826e = this.license;
                    C4913e c4913e = new C4913e(C11047e.f21919e, new C1319e(5, new C5565e(applicationContext, this, 2)));
                    InterfaceC8850e interfaceC8850e = c14826e.f29359e;
                    InterfaceC9452e c11993e = new C11993e(7);
                    if (interfaceC9452e == null) {
                        interfaceC9452e = c11993e;
                    }
                    this.purchase = new C4846e(new C4846e(new C7576e(c4913e, Collections.singletonList(new C15966e(AbstractC13480e.m3584final(C13664e.f27089e, list), (InterfaceC5083e) null, 6)), interfaceC9452e, interfaceC8850e)));
                }
                c4846e = this.purchase;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4846e;
    }
}
