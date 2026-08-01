package defpackage;

/* renamed from: eِؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11471e extends AbstractC7861e {
    /* renamed from: class */
    public AbstractC7861e mo204class() {
        int loadAd = loadAd();
        if ((loadAd & 1) == 0) {
            throw new IllegalStateException("Half-trace only defined for odd m");
        }
        int i = (loadAd + 1) >>> 1;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        AbstractC7861e abstractC7861e = this;
        int i2 = 1;
        while (numberOfLeadingZeros > 0) {
            abstractC7861e = abstractC7861e.premium(i2 << 1).ad(abstractC7861e);
            numberOfLeadingZeros--;
            i2 = i >>> numberOfLeadingZeros;
            if ((i2 & 1) != 0) {
                abstractC7861e = abstractC7861e.premium(2).ad(this);
            }
        }
        return abstractC7861e;
    }

    /* renamed from: goto */
    public int mo205goto() {
        int loadAd = loadAd();
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(loadAd);
        AbstractC7861e abstractC7861e = this;
        int i = 1;
        while (numberOfLeadingZeros > 0) {
            abstractC7861e = abstractC7861e.premium(i).ad(abstractC7861e);
            numberOfLeadingZeros--;
            i = loadAd >>> numberOfLeadingZeros;
            if ((i & 1) != 0) {
                abstractC7861e = abstractC7861e.applovin().ad(this);
            }
        }
        if (abstractC7861e.subscription()) {
            return 0;
        }
        if (abstractC7861e.admob()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }

    /* renamed from: interface */
    public boolean mo206interface() {
        return this instanceof C4489e;
    }

    @Override // defpackage.AbstractC7861e
    public AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        return ad(abstractC7861e);
    }
}
