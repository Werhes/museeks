package defpackage;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7529e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f15356e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10142e f15357e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15358e = 1;

    public /* synthetic */ C7529e(C10142e c10142e, int i, int i2) {
        this.f15357e = c10142e;
        this.f15356e = i;
    }

    public /* synthetic */ C7529e(C10142e c10142e, int i, List list) {
        this.f15357e = c10142e;
        this.f15356e = i;
    }

    public /* synthetic */ C7529e(C10142e c10142e, int i, List list, boolean z) {
        this.f15357e = c10142e;
        this.f15356e = i;
    }

    private final Object ad() {
        C10142e c10142e = this.f15357e;
        int i = this.f15356e;
        c10142e.f20069e.getClass();
        try {
            c10142e.f20074e.isVip(i, 9);
            synchronized (c10142e) {
                c10142e.f20070e.remove(Integer.valueOf(i));
                Unit unit = Unit.INSTANCE;
            }
        } catch (IOException unused) {
        }
        return Unit.INSTANCE;
    }

    private final Object vip() {
        C10142e c10142e = this.f15357e;
        int i = this.f15356e;
        c10142e.f20069e.getClass();
        synchronized (c10142e) {
            c10142e.f20070e.remove(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15358e) {
            case 0:
                return ad();
            case 1:
                return vip();
            default:
                C10142e c10142e = this.f15357e;
                int i = this.f15356e;
                c10142e.f20069e.getClass();
                try {
                    c10142e.f20074e.isVip(i, 9);
                    synchronized (c10142e) {
                        c10142e.f20070e.remove(Integer.valueOf(i));
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (IOException unused) {
                }
                return Unit.INSTANCE;
        }
    }
}
