package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9351e {
    public long ad;
    public C2152e adcel;
    public boolean startapp;
    public boolean yandex;
    public final SparseLongArray vip = new SparseLongArray();
    public final SparseBooleanArray metrica = new SparseBooleanArray();
    public final ArrayList license = new ArrayList();
    public final C2692e appmetrica = new C2692e((Object) null);
    public int purchase = -1;
    public int billing = -1;

    public final void ad(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.vip;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.ad;
                this.ad = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.ad;
            this.ad = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.metrica.put(pointerId2, true);
            }
        }
    }

    public final void appmetrica(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.metrica;
        SparseLongArray sparseLongArray = this.vip;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == keyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r1 != 4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0182 A[EDGE_INSN: B:41:0x0182->B:42:0x0182 BREAK  A[LOOP:0: B:20:0x00ea->B:38:0x0179], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C13567e license(defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e r43, android.view.MotionEvent r44, defpackage.C2152e r45, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9351e.license(eٜؗؗ, android.view.MotionEvent, eؓۡؖ, int, boolean):eْٟۡ");
    }

    public final C11883e metrica(MotionEvent motionEvent, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.metrica;
        if (actionMasked == 3 || actionMasked == 4) {
            this.vip.clear();
            sparseBooleanArray.clear();
            this.yandex = false;
            this.startapp = false;
            this.adcel = null;
            return null;
        }
        vip(motionEvent);
        ad(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.license;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.yandex = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.startapp = false;
            int pointerCount = motionEvent.getPointerCount();
            int i2 = 0;
            while (i2 < pointerCount) {
                arrayList.add(license(viewTreeObserverOnGlobalLayoutListenerC5014e, motionEvent, null, i2, (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i2++;
            }
        } else {
            this.startapp = true;
            if (motionEvent.getActionMasked() == 0) {
                float rawX = motionEvent.getRawX(0);
                this.adcel = new C2152e((Float.floatToRawIntBits(motionEvent.getRawY(0)) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
            }
            arrayList.add(license(viewTreeObserverOnGlobalLayoutListenerC5014e, motionEvent, this.adcel, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.yandex = false;
            this.startapp = false;
            this.adcel = null;
        }
        appmetrica(motionEvent);
        motionEvent.getEventTime();
        return new C11883e(arrayList, motionEvent, 8);
    }

    public final void vip(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.purchase && source == this.billing) {
            return;
        }
        this.purchase = toolType;
        this.billing = source;
        this.metrica.clear();
        this.vip.clear();
    }
}
