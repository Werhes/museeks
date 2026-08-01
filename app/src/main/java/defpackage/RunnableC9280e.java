package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9280e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f18498e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f18499e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18500e;

    public RunnableC9280e(BinderC5579e binderC5579e, C7568e c7568e, int i) {
        this.f18500e = 5;
        this.f18498e = c7568e;
        this.f18499e = i;
    }

    public /* synthetic */ RunnableC9280e(Object obj, int i, int i2) {
        this.f18500e = i2;
        this.f18498e = obj;
        this.f18499e = i;
    }

    public RunnableC9280e(List list, int i, Throwable th) {
        this.f18500e = 1;
        AbstractC4265e.billing(list, "initCallbacks cannot be null");
        this.f18498e = new ArrayList(list);
        this.f18499e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18500e) {
            case 0:
                AbstractC14437e abstractC14437e = (AbstractC14437e) ((C0731e) this.f18498e).f3025e;
                if (abstractC14437e != null) {
                    abstractC14437e.yandex(this.f18499e);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f18498e;
                int size = arrayList.size();
                int i = 0;
                if (this.f18499e != 1) {
                    while (i < size) {
                        ((AbstractC11696e) arrayList.get(i)).ad();
                        i++;
                    }
                    return;
                } else {
                    while (i < size) {
                        ((AbstractC11696e) arrayList.get(i)).vip();
                        i++;
                    }
                    return;
                }
            case 2:
                ((C1421e) this.f18498e).f4250e.smoothScrollToPosition(this.f18499e);
                return;
            case 3:
                ((SystemForegroundService) this.f18498e).f614e.cancel(this.f18499e);
                return;
            case 4:
                ((C1623e) this.f18498e).vip(this.f18499e);
                return;
            default:
                ((C7568e) this.f18498e).firebase.vip(this.f18499e);
                return;
        }
    }
}
