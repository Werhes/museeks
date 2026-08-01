package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6226e {
    public int ad;
    public boolean adcel;
    public int advert;
    public int amazon;
    public int appmetrica;
    public boolean billing;
    public int license;
    public int metrica;
    public boolean mopub;
    public boolean purchase;
    public long smaato;
    public boolean startapp;
    public int vip;
    public boolean yandex;

    public final void ad(int i) {
        if ((this.license & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.license));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.ad);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.appmetrica);
        sb.append(", mIsMeasuring=");
        sb.append(this.startapp);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.vip);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.metrica);
        sb.append(", mStructureChanged=");
        sb.append(this.purchase);
        sb.append(", mInPreLayout=");
        sb.append(this.billing);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.adcel);
        sb.append(", mRunPredictiveAnimations=");
        return AbstractC1786e.isVip(sb, this.mopub, '}');
    }

    public final int vip() {
        return this.billing ? this.vip - this.metrica : this.appmetrica;
    }
}
