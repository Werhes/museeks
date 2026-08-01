package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10256e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f20273e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f20274e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f20275e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f20276e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20277e = 1;

    public /* synthetic */ C10256e(C6162e c6162e, CharSequence charSequence, int i, int i2) {
        this.f20276e = c6162e;
        this.f20273e = charSequence;
        this.f20275e = i;
        this.f20274e = i2;
    }

    public /* synthetic */ C10256e(C10142e c10142e, int i, C16151e c16151e, int i2, boolean z) {
        this.f20276e = c10142e;
        this.f20275e = i;
        this.f20273e = c16151e;
        this.f20274e = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20277e) {
            case 0:
                C10142e c10142e = (C10142e) this.f20276e;
                int i = this.f20275e;
                C16151e c16151e = (C16151e) this.f20273e;
                int i2 = this.f20274e;
                try {
                    c10142e.f20069e.getClass();
                    c16151e.skip(i2);
                    c10142e.f20074e.isVip(i, 9);
                    synchronized (c10142e) {
                        c10142e.f20070e.remove(Integer.valueOf(i));
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (IOException unused) {
                }
                return Unit.INSTANCE;
            default:
                C6162e c6162e = (C6162e) this.f20276e;
                CharSequence charSequence = (CharSequence) this.f20273e;
                int i3 = this.f20275e;
                return "Expected " + c6162e.ad + " but got " + charSequence.subSequence(i3, this.f20274e + i3 + 1).toString();
        }
    }
}
