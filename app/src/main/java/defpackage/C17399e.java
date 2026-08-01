package defpackage;

import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۥٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17399e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f34103e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final DateTimeFormatter f34104e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final InterfaceC1179e f34105e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C2616e f34106e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f34107e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f34108e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C11952e f34109e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f34110e;

    public C17399e(InterfaceC1179e interfaceC1179e) {
        super(0);
        this.f34105e = interfaceC1179e;
        FormatStyle formatStyle = FormatStyle.MEDIUM;
        this.f34104e = DateTimeFormatter.ofLocalizedDateTime(formatStyle, formatStyle);
        this.f34107e = AbstractC14533e.startapp(C10786e.ad);
        Boolean bool = Boolean.FALSE;
        this.f34110e = AbstractC14533e.startapp(bool);
        this.f34103e = AbstractC14533e.startapp(bool);
        this.f34106e = new C2616e(0.0f);
        this.f34108e = AbstractC14533e.startapp(bool);
        this.f34109e = new C11952e();
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C5958e c5958e;
        boolean z;
        C5170e c5170e;
        C17399e c17399e = this;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(411845025);
        int i2 = i | (c13770e2.yandex(c17399e) ? 4 : 2);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C5958e ad = AbstractC9083e.ad(c13770e2);
            boolean booleanValue = ((Boolean) c17399e.f34110e.getValue()).booleanValue();
            C5170e c5170e2 = C2987e.ad;
            if (booleanValue) {
                c13770e2.m3676strictfp(-1446124629);
                boolean yandex = c13770e2.yandex(c17399e);
                Object m3681throw = c13770e2.m3681throw();
                if (yandex || m3681throw == c5170e2) {
                    m3681throw = new C12209e(c17399e, 5);
                    c13770e2.m3682throws(m3681throw);
                }
                C2892e license = AbstractC16653e.license(123653486, new C1446e(c17399e, 4, (byte) 0), c13770e2);
                C2892e license2 = AbstractC16653e.license(791035376, new C1446e(c17399e, 5, (byte) 0), c13770e2);
                C2892e license3 = AbstractC16653e.license(-355375437, new C1446e(c17399e, 6, (byte) 0), c13770e2);
                c5170e = c5170e2;
                z = false;
                c5958e = ad;
                AbstractC9262e.ad((Function0) m3681throw, license, null, license2, null, AbstractC15946e.metrica, license3, null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1772592, 0, 16276);
                c13770e2 = c13770e;
            } else {
                c5958e = ad;
                z = false;
                c5170e = c5170e2;
                c13770e2.m3676strictfp(-1456778399);
            }
            c13770e2.Signature(z);
            if (((Boolean) this.f34103e.getValue()).booleanValue()) {
                c13770e2.m3676strictfp(-1443945918);
                C9207e c9207e = new C9207e(4);
                boolean yandex2 = c13770e2.yandex(this);
                Object m3681throw2 = c13770e2.m3681throw();
                if (yandex2 || m3681throw2 == c5170e) {
                    m3681throw2 = new C12209e(this, 6);
                    c13770e2.m3682throws(m3681throw2);
                }
                AbstractC9262e.ad((Function0) m3681throw2, AbstractC15946e.appmetrica, null, AbstractC15946e.purchase, null, AbstractC15946e.billing, AbstractC16653e.license(-1882008740, new C1446e(this, 7, (byte) 0), c13770e2), null, 0L, 0L, 0L, 0L, 0.0f, c9207e, c13770e, 1772592, 3072, 8084);
                c13770e2 = c13770e;
            } else {
                c13770e2.m3676strictfp(-1456778399);
            }
            c13770e2.Signature(z);
            C5958e c5958e2 = c5958e;
            c17399e = this;
            AbstractC13348e.ad(null, AbstractC16653e.license(-22248099, new C17785e(c5958e2, this, 5), c13770e2), AbstractC16653e.license(-683837572, new C1446e(this, 8, (byte) 0), c13770e2), null, null, 0, 0L, 0L, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).license(c13770e2), AbstractC16653e.license(-1954709518, new C8937e(this, c5958e2, 7), c13770e2), c13770e2, 805306800, 249);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1446e(c17399e, i);
        }
    }

    @Override // defpackage.AbstractC13859e
    public final void isVip() {
        C18220e metrica = AbstractC4608e.metrica(vip());
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(metrica, ExecutorC3603e.f8134e, 0, new C8857e(this, null, 11), 2);
    }

    /* renamed from: private, reason: not valid java name */
    public final void m4312private(boolean z) {
        this.f34110e.setValue(Boolean.valueOf(z));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    /* renamed from: strictfp, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m4313strictfp(defpackage.AbstractC10731e r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17399e.m4313strictfp(eُؑ۠):java.io.Serializable");
    }
}
