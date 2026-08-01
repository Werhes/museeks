package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4092e extends AbstractC10298e {
    public final /* synthetic */ int ad = 0;
    public final Object license;
    public final C1622e metrica;
    public final long vip;

    public C4092e(C1622e c1622e, Object obj) {
        this.license = obj;
        if (c1622e == null) {
            C1622e c1622e2 = AbstractC7312e.ad;
            c1622e = AbstractC7312e.vip;
        }
        this.metrica = c1622e;
        this.vip = ((byte[]) obj).length;
    }

    public C4092e(InterfaceC11129e interfaceC11129e) {
        Set<Map.Entry> mopub = interfaceC11129e.mopub();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mopub) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C6571e(entry.getKey(), (String) it.next()));
            }
            AbstractC13480e.inmobi(arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder();
        AbstractC13480e.m3610while(arrayList, sb, "&", null, null, new C14407e(16), 60);
        String sb2 = sb.toString();
        Charset charset = AbstractC5508e.ad;
        this.license = AbstractC1266e.appmetrica(sb2, charset);
        this.vip = r8.length;
        C1622e c1622e = AbstractC7312e.metrica;
        int i = AbstractC9757e.ad;
        this.metrica = c1622e.m657e(charset.name());
    }

    @Override // defpackage.AbstractC14601e
    public final Long ad() {
        switch (this.ad) {
            case 0:
                return Long.valueOf(this.vip);
            default:
                return Long.valueOf(this.vip);
        }
    }

    @Override // defpackage.AbstractC10298e
    public final byte[] appmetrica() {
        switch (this.ad) {
            case 0:
                return (byte[]) this.license;
            default:
                return (byte[]) this.license;
        }
    }

    @Override // defpackage.AbstractC14601e
    public final C1622e vip() {
        switch (this.ad) {
            case 0:
                return this.metrica;
            default:
                return this.metrica;
        }
    }
}
