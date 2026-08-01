package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7279e extends AbstractC11583e {
    public C13773e[] ad;
    public int metrica;
    public String vip;

    public AbstractC7279e() {
        this.ad = null;
        this.metrica = 0;
    }

    public AbstractC7279e(AbstractC7279e abstractC7279e) {
        this.ad = null;
        this.metrica = 0;
        this.vip = abstractC7279e.vip;
        this.ad = AbstractC18491e.billing(abstractC7279e.ad);
    }

    public C13773e[] getPathData() {
        return this.ad;
    }

    public String getPathName() {
        return this.vip;
    }

    public void setPathData(C13773e[] c13773eArr) {
        if (!AbstractC18491e.vip(this.ad, c13773eArr)) {
            this.ad = AbstractC18491e.billing(c13773eArr);
            return;
        }
        C13773e[] c13773eArr2 = this.ad;
        for (int i = 0; i < c13773eArr.length; i++) {
            c13773eArr2[i].ad = c13773eArr[i].ad;
            int i2 = 0;
            while (true) {
                float[] fArr = c13773eArr[i].vip;
                if (i2 < fArr.length) {
                    c13773eArr2[i].vip[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
