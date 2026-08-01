package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11648e implements InterfaceC14576e {
    public Canvas ad = AbstractC16863e.ad;
    public Rect metrica;
    public Rect vip;

    @Override // defpackage.InterfaceC14576e
    public final void Signature(C1362e c1362e, long j, C11447e c11447e) {
        this.ad.drawBitmap(AbstractC11815e.vip(c1362e), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), AbstractC17331e.license(c11447e));
    }

    @Override // defpackage.InterfaceC14576e
    public final void ad(float f, float f2) {
        this.ad.scale(f, f2);
    }

    @Override // defpackage.InterfaceC14576e
    public final void adcel() {
        AbstractC8116e.vip(this.ad, false);
    }

    @Override // defpackage.InterfaceC14576e
    public final void admob() {
        this.ad.restore();
    }

    @Override // defpackage.InterfaceC14576e
    public final void advert(float[] fArr) {
        if (AbstractC11309e.billing(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        C14155e.metrica(matrix, fArr);
        this.ad.concat(matrix);
    }

    @Override // defpackage.InterfaceC14576e
    public final void amazon(float f, float f2, float f3, float f4, int i) {
        this.ad.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.InterfaceC14576e
    public final void appmetrica(C17985e c17985e, C11447e c11447e) {
        Canvas canvas = this.ad;
        if (!(c17985e instanceof C17985e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c17985e.ad, AbstractC17331e.license(c11447e));
    }

    @Override // defpackage.InterfaceC14576e
    public final void billing() {
        this.ad.save();
    }

    @Override // defpackage.InterfaceC14576e
    public final void license(C1362e c1362e, long j, long j2, long j3, C11447e c11447e) {
        if (this.vip == null) {
            this.vip = new Rect();
            this.metrica = new Rect();
        }
        Canvas canvas = this.ad;
        Bitmap vip = AbstractC11815e.vip(c1362e);
        Rect rect = this.vip;
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.metrica;
        int i3 = (int) 0;
        rect2.left = i3;
        int i4 = (int) 0;
        rect2.top = i4;
        rect2.right = i3 + ((int) (j3 >> 32));
        rect2.bottom = i4 + ((int) (4294967295L & j3));
        canvas.drawBitmap(vip, rect, rect2, AbstractC17331e.license(c11447e));
    }

    @Override // defpackage.InterfaceC14576e
    public final void loadAd(float f, float f2) {
        this.ad.translate(f, f2);
    }

    @Override // defpackage.InterfaceC14576e
    public final void metrica(float f, long j, C11447e c11447e) {
        this.ad.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, AbstractC17331e.license(c11447e));
    }

    @Override // defpackage.InterfaceC14576e
    public final void mopub(float f, float f2, float f3, float f4, C11447e c11447e) {
        this.ad.drawRect(f, f2, f3, f4, AbstractC17331e.license(c11447e));
    }

    @Override // defpackage.InterfaceC14576e
    public final void pro(C0763e c0763e, C11447e c11447e) {
        this.ad.saveLayer(c0763e.ad, c0763e.vip, c0763e.metrica, c0763e.license, AbstractC17331e.license(c11447e), 31);
    }

    @Override // defpackage.InterfaceC14576e
    public final void purchase(float f, float f2, float f3, float f4, float f5, float f6, C11447e c11447e) {
        this.ad.drawRoundRect(f, f2, f3, f4, f5, f6, AbstractC17331e.license(c11447e));
    }

    @Override // defpackage.InterfaceC14576e
    public final void remoteconfig(C0763e c0763e) {
        amazon(c0763e.ad, c0763e.vip, c0763e.metrica, c0763e.license, 1);
    }

    @Override // defpackage.InterfaceC14576e
    public final void signatures() {
        AbstractC8116e.vip(this.ad, true);
    }

    @Override // defpackage.InterfaceC14576e
    public final void smaato(C17985e c17985e) {
        Canvas canvas = this.ad;
        if (!(c17985e instanceof C17985e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c17985e.ad, Region.Op.INTERSECT);
    }

    @Override // defpackage.InterfaceC14576e
    public final void startapp(C0763e c0763e, C11447e c11447e) {
        mopub(c0763e.ad, c0763e.vip, c0763e.metrica, c0763e.license, c11447e);
    }

    @Override // defpackage.InterfaceC14576e
    public final void subscription(ArrayList arrayList, C11447e c11447e) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((C2152e) arrayList.get(i)).ad;
            this.ad.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), AbstractC17331e.license(c11447e));
        }
    }

    @Override // defpackage.InterfaceC14576e
    public final void tapsense(float f, float f2, float f3, float f4, float f5, float f6, C11447e c11447e) {
        this.ad.drawArc(f, f2, f3, f4, f5, f6, false, AbstractC17331e.license(c11447e));
    }

    @Override // defpackage.InterfaceC14576e
    public final void vip(float f) {
        this.ad.rotate(f);
    }

    @Override // defpackage.InterfaceC14576e
    public final void yandex(long j, long j2, C11447e c11447e) {
        this.ad.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), AbstractC17331e.license(c11447e));
    }
}
