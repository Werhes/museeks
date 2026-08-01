package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eِؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11757e implements InterfaceC4079e {
    public static final C8061e Companion = new Object();
    public final C6943e ad;
    public final String metrica;
    public final String vip;

    public C11757e(int i, C6943e c6943e, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C4916e.ad.appmetrica());
            throw null;
        }
        this.ad = c6943e;
        this.vip = (i & 2) == 0 ? String.valueOf(c6943e.mopub) : str;
        if ((i & 4) != 0) {
            this.metrica = str2;
        } else {
            String str3 = c6943e.pro;
            this.metrica = str3 == null ? BuildConfig.FLAVOR : str3;
        }
    }

    public C11757e(C6943e c6943e) {
        this.ad = c6943e;
        this.vip = String.valueOf(c6943e.mopub);
        String str = c6943e.pro;
        this.metrica = str == null ? BuildConfig.FLAVOR : str;
    }

    @Override // defpackage.InterfaceC4079e
    public final Object ad(InterfaceC5083e interfaceC5083e) {
        C6943e c6943e = this.ad;
        List list = c6943e.license;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C13804e(c6943e, (C2567e) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11757e) && AbstractC7890e.billing(this.ad, ((C11757e) obj).ad);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.vip;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        return "AudioBook(audioBook=" + this.ad + ')';
    }
}
