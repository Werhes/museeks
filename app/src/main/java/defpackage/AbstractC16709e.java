package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16709e extends AbstractC13922e {
    public final Object ad = new Object();
    public ArrayList appmetrica;
    public C16289e license;
    public C7988e metrica;
    public Executor vip;

    public String adcel() {
        return null;
    }

    public final void advert(C16289e c16289e, ArrayList arrayList) {
        if (c16289e == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.ad) {
            try {
                try {
                    Executor executor = this.vip;
                    if (executor != null) {
                        executor.execute(new RunnableC6795e(this, this.metrica, c16289e, arrayList, 9));
                    } else {
                        this.license = c16289e;
                        this.appmetrica = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public abstract void amazon(String str);

    public abstract void loadAd(ArrayList arrayList);

    public String mopub() {
        return null;
    }

    public abstract void smaato(String str);
}
