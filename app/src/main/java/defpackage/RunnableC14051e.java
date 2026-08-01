package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC14051e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15899e f27789e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f27790e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27791e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13391e f27792e = new C13391e(2);

    public RunnableC14051e(C15899e c15899e, Object obj, int i) {
        this.f27790e = i;
        this.f27789e = c15899e;
        this.f27791e = obj;
    }

    public static void ad(C15899e c15899e, String str) {
        WorkDatabase workDatabase = c15899e.appmetrica;
        C4956e amazon = workDatabase.amazon();
        C18540e startapp = workDatabase.startapp();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            EnumC7300e advert = amazon.advert(str2);
            if (advert != EnumC7300e.f14900e && advert != EnumC7300e.f14902e) {
                amazon.isVip(EnumC7300e.f14905e, str2);
            }
            linkedList.addAll(startapp.m4567break(str2));
        }
        C9327e c9327e = c15899e.yandex;
        synchronized (c9327e.f18581e) {
            try {
                C5401e.loadAd().smaato(C9327e.f18575e, "Processor cancelling " + str, new Throwable[0]);
                c9327e.f18583e.add(str);
                RunnableC10742e runnableC10742e = (RunnableC10742e) c9327e.f18586e.remove(str);
                boolean z = runnableC10742e != null;
                if (runnableC10742e == null) {
                    runnableC10742e = (RunnableC10742e) c9327e.f18585e.remove(str);
                }
                C9327e.vip(str, runnableC10742e);
                if (z) {
                    c9327e.startapp();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = c15899e.billing.iterator();
        while (it.hasNext()) {
            ((InterfaceC11096e) it.next()).license(str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13391e c13391e = this.f27792e;
        try {
            vip();
            c13391e.signatures(C13391e.f26641e);
        } catch (Throwable th) {
            c13391e.signatures(new C8037e(th));
        }
    }

    public final void vip() {
        WorkDatabase workDatabase;
        switch (this.f27790e) {
            case 0:
                C15899e c15899e = this.f27789e;
                workDatabase = c15899e.appmetrica;
                workDatabase.metrica();
                try {
                    ad(c15899e, ((UUID) this.f27791e).toString());
                    workDatabase.yandex();
                    workDatabase.purchase();
                    AbstractC8250e.ad(c15899e.license, c15899e.appmetrica, c15899e.billing);
                    return;
                } finally {
                    workDatabase.purchase();
                }
            default:
                C15899e c15899e2 = this.f27789e;
                workDatabase = c15899e2.appmetrica;
                workDatabase.metrica();
                try {
                    Iterator it = workDatabase.amazon().smaato((String) this.f27791e).iterator();
                    while (it.hasNext()) {
                        ad(c15899e2, (String) it.next());
                    }
                    workDatabase.yandex();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
