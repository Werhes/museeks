package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16234e {
    public final String ad;
    public final HashMap metrica = new HashMap();
    public final Class vip;

    public AbstractC16234e(Class cls, String str) {
        this.ad = str;
        this.vip = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        if (r0 != r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        if (r0.license(r2) == r10) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16234e.ad(eُؑ۠):java.lang.Object");
    }

    public final C8650e appmetrica(String str) {
        C18464e c18464e = new C18464e(23);
        c18464e.m4486e(str);
        C5170e c5170e = C5170e.f11063e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        ((C15783e) c18464e.f36192e).adcel("X-From", c5170e.amazon());
        ((C15783e) c18464e.f36192e).adcel("X-App-Id", "6767438");
        ((C15783e) c18464e.f36192e).adcel("X-Client-Version", "10683");
        CRC32 crc32 = new CRC32();
        C5089e c5089e = C15959e.vip;
        String valueOf = c5089e.ad() ? String.valueOf(c5089e.metrica.ad) : "anonymous";
        Charset charset = AbstractC5508e.ad;
        crc32.update(valueOf.getBytes(charset));
        crc32.update(str.getBytes(charset));
        crc32.update(48);
        ((C15783e) c18464e.f36192e).adcel("X-CRC", String.valueOf(crc32.getValue()));
        if (purchase()) {
            StringBuilder sb = new StringBuilder("Bearer ");
            C15959e c15959e = C15959e.ad;
            sb.append(c5089e.ad() ? c5089e.vip.vip : BuildConfig.FLAVOR);
            ((C15783e) c18464e.f36192e).adcel("Authorization", sb.toString());
        }
        if (license() != null) {
            String str2 = (String) license().f13544e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : ((Map) license().f13543e).entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                arrayList.add(AbstractC11309e.metrica(str3, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC11309e.metrica(str4, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            Unit unit = Unit.INSTANCE;
            c18464e.m4494e(str2, new C15110e(arrayList, arrayList2));
        }
        return new C8650e(c18464e);
    }

    public boolean billing() {
        return false;
    }

    public C6571e license() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C10626e
            if (r0 == 0) goto L13
            r0 = r5
            eَۣۙ r0 = (defpackage.C10626e) r0
            int r1 = r0.f20942e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20942e = r1
            goto L18
        L13:
            eَۣۙ r0 = new eَۣۙ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20941e
            int r1 = r0.f20942e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f20942e = r2
            java.lang.Object r5 = r4.ad(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L3b
            return r0
        L3b:
            eّۢۧ r5 = (defpackage.AbstractC12834e) r5
            r5.close()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16234e.metrica(eُؑ۠):java.lang.Object");
    }

    public boolean purchase() {
        return true;
    }

    public final void startapp(String str, String str2) {
        if (str2 != null) {
            this.metrica.put(str, str2);
        }
    }

    public final Object vip(AbstractC10731e abstractC10731e) {
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC5336e.advert(ExecutorC3603e.f8134e, new C4803e(this, null, 0), abstractC10731e);
    }

    public boolean yandex() {
        return false;
    }
}
