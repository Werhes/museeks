package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import kotlin.Unit;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12475e {
    public static final C2892e adcel;
    public static final C2892e advert;
    public static final C2892e amazon;
    public static final C2892e appmetrica;
    public static final C2892e billing;
    public static final C2892e license;
    public static final C2892e mopub;
    public static final C2892e purchase;
    public static final C2892e smaato;
    public static final C2892e startapp;
    public static final C2892e yandex;
    public static final C2892e ad = new C2892e(842569838, false, new C11049e(20));
    public static final C2892e vip = new C2892e(-1190004643, false, new C11049e(25));
    public static final C2892e metrica = new C2892e(-2090918406, false, new C11049e(26));

    static {
        new C2892e(1638406765, false, new C0972e(28));
        new C2892e(-574318339, false, new C0972e(22));
        license = new C2892e(606875110, false, new C0972e(23));
        appmetrica = new C2892e(-1787123867, false, new C11049e(21));
        purchase = new C2892e(1614656313, false, new C11049e(22));
        billing = new C2892e(2111907772, false, new C0972e(24));
        yandex = new C2892e(441738374, false, new C9868e(5));
        startapp = new C2892e(2016417336, false, new C0972e(25));
        adcel = new C2892e(-1569384022, false, new C0972e(26));
        mopub = new C2892e(-1805027808, false, new C9868e(6));
        advert = new C2892e(-234620242, false, new C0972e(27));
        smaato = new C2892e(1655815421, false, new C11049e(23));
        amazon = new C2892e(1243518790, false, new C11049e(24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object ad(Collection collection, AbstractC10731e abstractC10731e) {
        if (collection.isEmpty()) {
            return C13664e.f27089e;
        }
        InterfaceC1908e[] interfaceC1908eArr = (InterfaceC1908e[]) collection.toArray(new InterfaceC1908e[0]);
        C12544e c12544e = new C12544e(interfaceC1908eArr);
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(abstractC10731e));
        c13578e.tapsense();
        int length = interfaceC1908eArr.length;
        C15650e[] c15650eArr = new C15650e[length];
        for (int i = 0; i < length; i++) {
            InterfaceC6334e interfaceC6334e = interfaceC1908eArr[i];
            ((C6467e) interfaceC6334e).start();
            C15650e c15650e = new C15650e(c12544e, c13578e);
            c15650e.f30860e = AbstractC6629e.smaato(interfaceC6334e, true, c15650e);
            Unit unit = Unit.INSTANCE;
            c15650eArr[i] = c15650e;
        }
        C16941e c16941e = new C16941e(c15650eArr);
        for (int i2 = 0; i2 < length; i2++) {
            C15650e c15650e2 = c15650eArr[i2];
            c15650e2.getClass();
            C15650e.f30857e.set(c15650e2, c16941e);
        }
        if (c13578e.premium()) {
            c16941e.vip();
        } else {
            c13578e.isPro(c16941e);
        }
        return c13578e.signatures();
    }

    public static final C12816e appmetrica(C12816e c12816e, C12816e c12816e2) {
        C13579e c13579e = c12816e.ad;
        C13579e c13579e2 = c12816e2.ad;
        if (!c12816e.equals(c12816e2) && !c13579e2.metrica()) {
            String str = c13579e.ad;
            String str2 = c13579e2.ad;
            if (!AbstractC6507e.pro(str, str2, false) || str.charAt(str2.length()) != '.') {
                return c12816e;
            }
        }
        return c13579e2.metrica() ? c12816e : c12816e.equals(c12816e2) ? C12816e.metrica : new C12816e(c13579e.ad.substring(c13579e2.ad.length() + 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0.length() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C3087e license(java.lang.String r21) {
        /*
            r0 = r21
            int r1 = r0.length()
            java.lang.String r2 = "Failed requirement."
            if (r1 <= 0) goto Lb3
            r1 = 0
            char r3 = r0.charAt(r1)
            r4 = 48
            eؕؒۚ r5 = defpackage.C3087e.f7170e
            if (r3 != r4) goto L34
            int r3 = r0.length()
            r4 = 1
            if (r3 != r4) goto L1d
            goto L33
        L1d:
            java.lang.String r3 = "^0+"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.lang.String r4 = ""
            java.util.regex.Matcher r0 = r3.matcher(r0)
            java.lang.String r0 = r0.replaceFirst(r4)
            int r3 = r0.length()
            if (r3 != 0) goto L34
        L33:
            return r5
        L34:
            int r3 = r0.length()
            if (r3 <= 0) goto Lb2
            int r3 = r0.length()
            r4 = 9
            int r3 = r3 % r4
            if (r3 != 0) goto L44
            goto L45
        L44:
            r4 = r3
        L45:
            java.lang.String r3 = r0.substring(r1, r4)
            eُؔۜ r6 = defpackage.AbstractC0578e.metrica(r3)
            if (r6 == 0) goto Lad
            int r3 = r6.f6827e
            long r6 = r5.f7172e
            r8 = 32
            long r9 = r6 >>> r8
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r11
            long r13 = r5.f7171e
            long r15 = r13 >>> r8
            long r13 = r13 & r11
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            r21 = r8
            r17 = r9
            long r8 = (long) r1
            long r8 = r8 & r11
            long r13 = r13 * r8
            long r15 = r15 * r8
            long r19 = r13 >>> r21
            long r15 = r15 + r19
            long r6 = r6 * r8
            long r19 = r15 >>> r21
            long r6 = r6 + r19
            long r9 = r17 * r8
            long r17 = r6 >>> r21
            long r9 = r9 + r17
            long r15 = r15 << r21
            long r13 = r13 & r11
            long r15 = r15 + r13
            long r8 = r9 << r21
            long r6 = r6 & r11
            long r8 = r8 + r6
            long r6 = (long) r3
            long r6 = r6 & r11
            long r6 = r6 + r15
            r10 = -9223372036854775808
            long r12 = r6 ^ r10
            long r10 = r10 ^ r15
            int r1 = java.lang.Long.compare(r12, r10)
            if (r1 >= 0) goto L95
            r10 = 1
            long r8 = r8 + r10
        L95:
            eؕؒۚ r1 = new eؕؒۚ
            r1.<init>(r8, r6)
            int r3 = r1.compareTo(r5)
            if (r3 < 0) goto La7
            java.lang.String r0 = r0.substring(r4)
            r5 = r1
            r1 = 0
            goto L34
        La7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        Lad:
            defpackage.AbstractC6507e.Signature(r3)
            r0 = 0
            throw r0
        Lb2:
            return r5
        Lb3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12475e.license(java.lang.String):eؕؒۚ");
    }

    public static final AbstractC10727e metrica(int i, int i2, C13770e c13770e) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
        Resources resources = (Resources) c13770e.adcel(AbstractC2676e.metrica);
        C7436e c7436e = (C7436e) c13770e.adcel(AbstractC2676e.appmetrica);
        synchronized (c7436e) {
            typedValue = (TypedValue) c7436e.ad.vip(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                C3123e c3123e = c7436e.ad;
                int license2 = c3123e.license(i);
                Object[] objArr = c3123e.metrica;
                Object obj = objArr[license2];
                c3123e.vip[license2] = i;
                objArr[license2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AbstractC5304e.subs(charSequence, ".xml")) {
            c13770e.m3676strictfp(-1771643000);
            Object theme = context.getTheme();
            boolean purchase2 = c13770e.purchase(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !c13770e.license(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean purchase3 = purchase2 | z | c13770e.purchase(theme);
            Object m3681throw = c13770e.m3681throw();
            if (purchase3 || m3681throw == C2987e.ad) {
                try {
                    m3681throw = new C1362e(((BitmapDrawable) resources.getDrawable(i, null)).getBitmap());
                    c13770e.m3682throws(m3681throw);
                } catch (Exception e) {
                    throw new C14803e(12, "Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            C8368e c8368e = new C8368e((C1362e) m3681throw, (r0.ad.getWidth() << 32) | (r0.ad.getHeight() & 4294967295L));
            c13770e.Signature(false);
            return c8368e;
        }
        c13770e.m3676strictfp(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i3 = typedValue.changingConfigurations;
        C2843e c2843e = (C2843e) c13770e.adcel(AbstractC2676e.license);
        C8963e c8963e = new C8963e(i, theme2);
        WeakReference weakReference = (WeakReference) c2843e.ad.get(c8963e);
        C14162e c14162e = weakReference != null ? (C14162e) weakReference.get() : null;
        if (c14162e == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!AbstractC7890e.billing(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            c14162e = AbstractC13671e.appmetrica(theme2, resources, xml, i3);
            c2843e.ad.put(c8963e, new WeakReference(c14162e));
        }
        C14156e billing2 = AbstractC10115e.billing(c14162e.ad, c13770e);
        c13770e.Signature(false);
        return billing2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(java.util.Collection r4, defpackage.InterfaceC5083e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C2124e
            if (r0 == 0) goto L13
            r0 = r5
            eٍؓ۟ r0 = (defpackage.C2124e) r0
            int r1 = r0.f5500e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5500e = r1
            goto L18
        L13:
            eٍؓ۟ r0 = new eٍؓ۟
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f5498e
            int r1 = r0.f5500e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.util.Iterator r4 = r0.f5499e
            defpackage.AbstractC2003e.purchase(r5)
            goto L38
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            eَٟۙ r5 = (defpackage.InterfaceC10500e) r5
            r0.f5499e = r4
            r0.f5500e = r2
            java.lang.Object r5 = r5.mo696protected(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r5 != r1) goto L38
            return r1
        L51:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12475e.vip(java.util.Collection, eًؗۖ):java.lang.Object");
    }
}
