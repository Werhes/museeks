package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11787e {
    public static final C6399e mopub = AbstractC14385e.ad("http://localhost");
    public String ad;
    public C16722e adcel;
    public String appmetrica;
    public String billing;
    public C16063e license;
    public int metrica;
    public String purchase;
    public InterfaceC14071e startapp;
    public boolean vip;
    public List yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [eَّۙ, java.lang.Object] */
    public C11787e() {
        InterfaceC11129e.vip.getClass();
        this.ad = BuildConfig.FLAVOR;
        this.vip = false;
        this.metrica = 0;
        this.license = null;
        this.appmetrica = null;
        this.purchase = null;
        Set set = AbstractC6528e.ad;
        Charset charset = AbstractC5508e.ad;
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        ?? obj = new Object();
        AbstractC16540e.metrica(newEncoder, obj, BuildConfig.FLAVOR, 0, 0);
        while (!obj.yandex()) {
            while (!obj.yandex()) {
                byte readByte = obj.readByte();
                Byte valueOf = Byte.valueOf(readByte);
                if (readByte == 32) {
                    sb.append("%20");
                } else if (AbstractC6528e.ad.contains(valueOf) || AbstractC6528e.metrica.contains(valueOf)) {
                    sb.append((char) readByte);
                } else {
                    sb.append(AbstractC6528e.billing(readByte));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        this.billing = sb.toString();
        C13664e c13664e = C13664e.f27089e;
        this.yandex = new ArrayList(AbstractC0746e.subscription(c13664e, 10));
        C10095e c10095e = new C10095e(1);
        while (true) {
            C15897e c15897e = C15897e.f31334e;
            if (!c15897e.hasNext()) {
                this.startapp = c10095e;
                this.adcel = new C16722e(c10095e);
                return;
            }
            c10095e.mo858e(AbstractC6528e.appmetrica((String) c15897e.next(), false), new ArrayList(AbstractC0746e.subscription(c13664e, 10)));
        }
    }

    public final void ad() {
        if (this.ad.length() <= 0 && !AbstractC7890e.billing(license().f31630e, "file")) {
            C6399e c6399e = mopub;
            this.ad = c6399e.f13273e;
            if (this.license == null) {
                this.license = c6399e.f13264e;
            }
            if (this.metrica == 0) {
                appmetrica(c6399e.f13266e);
            }
        }
    }

    public final void appmetrica(int i) {
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.metrica = i;
    }

    public final C16063e license() {
        C16063e c16063e = this.license;
        if (c16063e != null) {
            return c16063e;
        }
        C16063e c16063e2 = C16063e.f31627e;
        return C16063e.f31627e;
    }

    public final String metrica() {
        ad();
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        AbstractC9186e.metrica(this, sb);
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        AbstractC9186e.metrica(this, sb);
        return sb.toString();
    }

    public final C6399e vip() {
        ad();
        C16063e c16063e = this.license;
        String str = this.ad;
        int i = this.metrica;
        List list = this.yandex;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6528e.metrica(0, 0, 7, (String) it.next()));
        }
        InterfaceC11129e ad = AbstractC5857e.ad((InterfaceC14071e) this.adcel.f32780e);
        AbstractC6528e.license(0, 0, 15, this.billing);
        String str2 = this.appmetrica;
        String metrica = str2 != null ? AbstractC6528e.metrica(0, 0, 7, str2) : null;
        String str3 = this.purchase;
        return new C6399e(c16063e, str, i, arrayList, ad, metrica, str3 != null ? AbstractC6528e.metrica(0, 0, 7, str3) : null, this.vip, metrica());
    }
}
