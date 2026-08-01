package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6981e {
    public final /* synthetic */ int ad = 1;
    public boolean appmetrica;
    public boolean license;
    public int metrica;
    public Object purchase;
    public int vip;

    public C6981e() {
        billing();
    }

    public C6981e(int i) {
        this.vip = i;
        byte[] bArr = new byte[131];
        this.purchase = bArr;
        bArr[2] = 1;
    }

    public C6981e(C7422e c7422e) {
        this.purchase = c7422e;
    }

    public void ad(int i, int i2, byte[] bArr) {
        if (this.license) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.purchase;
            int length = bArr2.length;
            int i4 = this.metrica;
            if (length < i4 + i3) {
                this.purchase = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.purchase, this.metrica, i3);
            this.metrica += i3;
        }
    }

    public boolean appmetrica(int i) {
        if (!this.license) {
            return false;
        }
        this.metrica -= i;
        this.license = false;
        this.appmetrica = true;
        return true;
    }

    public void billing() {
        switch (this.ad) {
            case 1:
                this.vip = -1;
                this.metrica = RecyclerView.UNDEFINED_DURATION;
                this.license = false;
                this.appmetrica = false;
                return;
            default:
                this.license = false;
                this.appmetrica = false;
                return;
        }
    }

    public void license(View view, int i) {
        AbstractC6945e abstractC6945e = (AbstractC6945e) this.purchase;
        int advert = Integer.MIN_VALUE == abstractC6945e.ad ? 0 : abstractC6945e.advert() - abstractC6945e.ad;
        if (advert >= 0) {
            metrica(view, i);
            return;
        }
        this.vip = i;
        if (!this.license) {
            int appmetrica = ((AbstractC6945e) this.purchase).appmetrica(view);
            int mopub = appmetrica - ((AbstractC6945e) this.purchase).mopub();
            this.metrica = appmetrica;
            if (mopub > 0) {
                int billing = (((AbstractC6945e) this.purchase).billing() - Math.min(0, (((AbstractC6945e) this.purchase).billing() - advert) - ((AbstractC6945e) this.purchase).vip(view))) - (((AbstractC6945e) this.purchase).metrica(view) + appmetrica);
                if (billing < 0) {
                    this.metrica -= Math.min(mopub, -billing);
                    return;
                }
                return;
            }
            return;
        }
        int billing2 = (((AbstractC6945e) this.purchase).billing() - advert) - ((AbstractC6945e) this.purchase).vip(view);
        this.metrica = ((AbstractC6945e) this.purchase).billing() - billing2;
        if (billing2 > 0) {
            int metrica = this.metrica - ((AbstractC6945e) this.purchase).metrica(view);
            int mopub2 = ((AbstractC6945e) this.purchase).mopub();
            int min = metrica - (Math.min(((AbstractC6945e) this.purchase).appmetrica(view) - mopub2, 0) + mopub2);
            if (min < 0) {
                this.metrica = Math.min(billing2, -min) + this.metrica;
            }
        }
    }

    public void metrica(View view, int i) {
        if (this.license) {
            int vip = ((AbstractC6945e) this.purchase).vip(view);
            AbstractC6945e abstractC6945e = (AbstractC6945e) this.purchase;
            this.metrica = (Integer.MIN_VALUE == abstractC6945e.ad ? 0 : abstractC6945e.advert() - abstractC6945e.ad) + vip;
        } else {
            this.metrica = ((AbstractC6945e) this.purchase).appmetrica(view);
        }
        this.vip = i;
    }

    public void purchase(int i) {
        this.license |= i > 0;
        this.vip += i;
    }

    public String toString() {
        switch (this.ad) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.vip);
                sb.append(", mCoordinate=");
                sb.append(this.metrica);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.license);
                sb.append(", mValid=");
                return AbstractC1786e.isVip(sb, this.appmetrica, '}');
            default:
                return super.toString();
        }
    }

    public void vip() {
        this.metrica = this.license ? ((AbstractC6945e) this.purchase).billing() : ((AbstractC6945e) this.purchase).mopub();
    }

    public void yandex(int i) {
        AbstractC2301e.subscription(!this.license);
        boolean z = i == this.vip;
        this.license = z;
        if (z) {
            this.metrica = 3;
            this.appmetrica = false;
        }
    }
}
