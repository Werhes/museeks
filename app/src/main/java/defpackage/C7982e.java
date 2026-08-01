package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7982e {
    public boolean ad;
    public final Object adcel;
    public Object advert;
    public final Object appmetrica;
    public final Object billing;
    public final Object license;
    public final Object metrica;
    public Object mopub;
    public final Object purchase;
    public final Object startapp;
    public final Object vip;
    public final Object yandex;

    public C7982e() {
        this.vip = new C16022e[4];
        this.metrica = new Matrix[4];
        this.license = new Matrix[4];
        this.appmetrica = new PointF();
        this.purchase = new Path();
        this.billing = new Path();
        this.yandex = new C16022e();
        this.startapp = new float[2];
        this.adcel = new float[2];
        this.mopub = new Path();
        this.advert = new Path();
        this.ad = true;
        for (int i = 0; i < 4; i++) {
            ((C16022e[]) this.vip)[i] = new C16022e();
            ((Matrix[]) this.metrica)[i] = new Matrix();
            ((Matrix[]) this.license)[i] = new Matrix();
        }
    }

    public C7982e(C11246e c11246e, C4174e c4174e, C2399e c2399e, C5350e c5350e) {
        this.vip = c5350e;
        this.billing = c11246e;
        this.mopub = new C2166e();
        this.license = new IdentityHashMap();
        this.appmetrica = new HashMap();
        this.metrica = new ArrayList();
        this.startapp = c4174e;
        this.adcel = c2399e;
        this.purchase = new HashMap();
        this.yandex = new HashSet();
    }

    public AbstractC6690e ad(int i, ArrayList arrayList, C2166e c2166e) {
        ArrayList arrayList2 = (ArrayList) this.metrica;
        if (!arrayList.isEmpty()) {
            this.mopub = c2166e;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                C8846e c8846e = (C8846e) arrayList.get(i2 - i);
                if (i2 > 0) {
                    C8846e c8846e2 = (C8846e) arrayList2.get(i2 - 1);
                    c8846e.license = c8846e2.ad.loadAd.appmetrica.loadAd() + c8846e2.license;
                    c8846e.appmetrica = false;
                    c8846e.metrica.clear();
                } else {
                    c8846e.license = 0;
                    c8846e.appmetrica = false;
                    c8846e.metrica.clear();
                }
                int loadAd = c8846e.ad.loadAd.appmetrica.loadAd();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((C8846e) arrayList2.get(i3)).license += loadAd;
                }
                arrayList2.add(i2, c8846e);
                ((HashMap) this.appmetrica).put(c8846e.vip, c8846e);
                if (this.ad) {
                    billing(c8846e);
                    if (((IdentityHashMap) this.license).isEmpty()) {
                        ((HashSet) this.yandex).add(c8846e);
                    } else {
                        C14018e c14018e = (C14018e) ((HashMap) this.purchase).get(c8846e);
                        if (c14018e != null) {
                            c14018e.ad.metrica(c14018e.vip);
                        }
                    }
                }
            }
        }
        return metrica();
    }

    public void appmetrica(C8846e c8846e) {
        if (c8846e.appmetrica && c8846e.metrica.isEmpty()) {
            C14018e c14018e = (C14018e) ((HashMap) this.purchase).remove(c8846e);
            c14018e.getClass();
            C17669e c17669e = c14018e.metrica;
            AbstractC3317e abstractC3317e = c14018e.ad;
            abstractC3317e.loadAd(c14018e.vip);
            abstractC3317e.subscription(c17669e);
            abstractC3317e.admob(c17669e);
            ((HashSet) this.yandex).remove(c8846e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eٟ٘ؖ, eؘٞؖ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eۣؗٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eًَٝ, java.lang.Object] */
    public void billing(C8846e c8846e) {
        C10170e c10170e = c8846e.ad;
        ?? r1 = new InterfaceC5779e() { // from class: eٟ٘ؖ
            @Override // defpackage.InterfaceC5779e
            public final void ad(AbstractC3317e abstractC3317e, AbstractC6690e abstractC6690e) {
                C2399e c2399e = ((C11246e) C7982e.this.billing).f22562e;
                c2399e.purchase(2);
                c2399e.billing(22);
            }
        };
        C17669e c17669e = new C17669e(this, c8846e);
        ((HashMap) this.purchase).put(c8846e, new C14018e(c10170e, r1, c17669e));
        Handler handler = new Handler(AbstractC9413e.applovin(), null);
        c10170e.getClass();
        Csuper csuper = c10170e.metrica;
        csuper.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) csuper.f36471e;
        ?? obj = new Object();
        obj.ad = handler;
        obj.vip = c17669e;
        copyOnWriteArrayList.add(obj);
        Handler handler2 = new Handler(AbstractC9413e.applovin(), null);
        C15683e c15683e = c10170e.license;
        c15683e.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c15683e.metrica;
        ?? obj2 = new Object();
        obj2.ad = handler2;
        obj2.vip = c17669e;
        copyOnWriteArrayList2.add(obj2);
        c10170e.mopub(r1, (InterfaceC4407e) this.advert, (C5350e) this.vip);
    }

    public void license() {
        Iterator it = ((HashSet) this.yandex).iterator();
        while (it.hasNext()) {
            C8846e c8846e = (C8846e) it.next();
            if (c8846e.metrica.isEmpty()) {
                C14018e c14018e = (C14018e) ((HashMap) this.purchase).get(c8846e);
                if (c14018e != null) {
                    c14018e.ad.metrica(c14018e.vip);
                }
                it.remove();
            }
        }
    }

    public AbstractC6690e metrica() {
        ArrayList arrayList = (ArrayList) this.metrica;
        if (arrayList.isEmpty()) {
            return AbstractC6690e.ad;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C8846e c8846e = (C8846e) arrayList.get(i2);
            c8846e.license = i;
            i += c8846e.ad.loadAd.appmetrica.loadAd();
        }
        return new C9189e(arrayList, (C2166e) this.mopub);
    }

    public boolean purchase(Path path, int i) {
        Path path2 = (Path) this.advert;
        path2.reset();
        ((C16022e[]) this.vip)[i].vip(((Matrix[]) this.metrica)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void startapp(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.metrica;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C8846e c8846e = (C8846e) arrayList.remove(i3);
            ((HashMap) this.appmetrica).remove(c8846e.vip);
            int i4 = -c8846e.ad.loadAd.appmetrica.loadAd();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C8846e) arrayList.get(i5)).license += i4;
            }
            c8846e.appmetrica = true;
            if (this.ad) {
                appmetrica(c8846e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void vip(C15339e c15339e, float f, RectF rectF, C15816e c15816e, Path path) {
        int i;
        boolean z;
        float f2;
        C15816e c15816e2;
        boolean z2;
        C15816e c15816e3 = c15816e;
        Matrix[] matrixArr = (Matrix[]) this.license;
        float[] fArr = (float[]) this.startapp;
        C16022e[] c16022eArr = (C16022e[]) this.vip;
        Matrix[] matrixArr2 = (Matrix[]) this.metrica;
        path.rewind();
        Path path2 = (Path) this.purchase;
        path2.rewind();
        Path path3 = (Path) this.billing;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            z = 0;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.appmetrica;
            InterfaceC16189e interfaceC16189e = i2 != 1 ? i2 != 2 ? i2 != 3 ? c15339e.purchase : c15339e.appmetrica : c15339e.yandex : c15339e.billing;
            AbstractC0421e abstractC0421e = i2 != 1 ? i2 != 2 ? i2 != 3 ? c15339e.vip : c15339e.ad : c15339e.license : c15339e.metrica;
            C16022e c16022e = c16022eArr[i2];
            abstractC0421e.getClass();
            Matrix[] matrixArr3 = matrixArr;
            abstractC0421e.purchase(c16022e, f, interfaceC16189e.ad(rectF));
            int i3 = i2 + 1;
            float f3 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            C16022e c16022e2 = c16022eArr[i2];
            fArr[0] = c16022e2.vip;
            fArr[1] = c16022e2.metrica;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i2].preRotate(f3);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            C16022e c16022e3 = c16022eArr[i4];
            c16022e3.getClass();
            fArr[z] = 0.0f;
            fArr[1] = c16022e3.ad;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[z], fArr[1]);
            } else {
                path.lineTo(fArr[z], fArr[1]);
            }
            c16022eArr[i4].vip(matrixArr2[i4], path);
            if (c15816e3 != null) {
                C16022e c16022e4 = c16022eArr[i4];
                Matrix matrix = matrixArr2[i4];
                C11252e c11252e = (C11252e) c15816e3.f31190e;
                BitSet bitSet = c11252e.f22615e;
                c16022e4.getClass();
                f2 = 0.0f;
                bitSet.set(i4, z);
                AbstractC15107e[] abstractC15107eArr = c11252e.f22607e;
                c16022e4.ad(c16022e4.appmetrica);
                abstractC15107eArr[i4] = new C2341e(new ArrayList(c16022e4.billing), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path4 = (Path) this.mopub;
            C16022e c16022e5 = (C16022e) this.yandex;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C16022e c16022e6 = c16022eArr[i4];
            fArr[0] = c16022e6.vip;
            fArr[1] = c16022e6.metrica;
            matrixArr2[i4].mapPoints(fArr);
            float[] fArr2 = (float[]) this.adcel;
            C16022e c16022e7 = c16022eArr[i6];
            c16022e7.getClass();
            fArr2[0] = f2;
            fArr2[1] = c16022e7.ad;
            matrixArr2[i6].mapPoints(fArr2);
            C16022e[] c16022eArr2 = c16022eArr;
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            C16022e c16022e8 = c16022eArr2[i4];
            fArr[0] = c16022e8.vip;
            fArr[1] = c16022e8.metrica;
            matrixArr5[i4].mapPoints(fArr);
            if (i4 == 1 || i4 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            c16022e5.license(0.0f, 270.0f, 0.0f);
            (i4 != 1 ? i4 != 2 ? i4 != 3 ? c15339e.adcel : c15339e.startapp : c15339e.advert : c15339e.mopub).getClass();
            c16022e5.metrica(max, 0.0f);
            path4.reset();
            c16022e5.vip(matrixArr4[i4], path4);
            if (this.ad && (purchase(path4, i4) || purchase(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c16022e5.ad;
                matrixArr4[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c16022e5.vip(matrixArr4[i4], path2);
            } else {
                c16022e5.vip(matrixArr4[i4], path);
            }
            if (c15816e != null) {
                Matrix matrix2 = matrixArr4[i4];
                c15816e2 = c15816e;
                C11252e c11252e2 = (C11252e) c15816e2.f31190e;
                z2 = false;
                c11252e2.f22615e.set(i4 + 4, false);
                AbstractC15107e[] abstractC15107eArr2 = c11252e2.f22602e;
                c16022e5.ad(c16022e5.appmetrica);
                abstractC15107eArr2[i4] = new C2341e(new ArrayList(c16022e5.billing), new Matrix(matrix2));
            } else {
                c15816e2 = c15816e;
                z2 = false;
            }
            z = z2;
            c15816e3 = c15816e2;
            i4 = i5;
            c16022eArr = c16022eArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public void yandex(InterfaceC14239e interfaceC14239e) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.license;
        C8846e c8846e = (C8846e) identityHashMap.remove(interfaceC14239e);
        c8846e.getClass();
        c8846e.ad.amazon(interfaceC14239e);
        c8846e.metrica.remove(((C9500e) interfaceC14239e).f18849e);
        if (!identityHashMap.isEmpty()) {
            license();
        }
        appmetrica(c8846e);
    }
}
