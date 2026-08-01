package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12078e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f24208e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f24209e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C10872e f24210e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC13118e[] f24211e;

    /* JADX WARN: Type inference failed for: r0v3, types: [eؘۢؕ, eُؚۥ] */
    public final C10872e adcel() {
        C10872e c10872e;
        synchronized (this) {
            C10872e c10872e2 = this.f24210e;
            c10872e = c10872e2;
            if (c10872e2 == null) {
                int i = this.f24209e;
                ?? c5981e = new C5981e(1, Alert.DURATION_SHOW_INDEFINITELY, 2);
                c5981e.purchase(Integer.valueOf(i));
                this.f24210e = c5981e;
                c10872e = c5981e;
            }
        }
        return c10872e;
    }

    public abstract AbstractC13118e appmetrica();

    public abstract AbstractC13118e[] billing();

    public final AbstractC13118e metrica() {
        AbstractC13118e abstractC13118e;
        C10872e c10872e;
        synchronized (this) {
            try {
                AbstractC13118e[] abstractC13118eArr = this.f24211e;
                if (abstractC13118eArr == null) {
                    abstractC13118eArr = billing();
                    this.f24211e = abstractC13118eArr;
                } else if (this.f24209e >= abstractC13118eArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC13118eArr, abstractC13118eArr.length * 2);
                    this.f24211e = (AbstractC13118e[]) copyOf;
                    abstractC13118eArr = (AbstractC13118e[]) copyOf;
                }
                int i = this.f24208e;
                do {
                    abstractC13118e = abstractC13118eArr[i];
                    if (abstractC13118e == null) {
                        abstractC13118e = appmetrica();
                        abstractC13118eArr[i] = abstractC13118e;
                    }
                    i++;
                    if (i >= abstractC13118eArr.length) {
                        i = 0;
                    }
                } while (!abstractC13118e.ad(this));
                this.f24208e = i;
                this.f24209e++;
                c10872e = this.f24210e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c10872e != null) {
            c10872e.inmobi(1);
        }
        return abstractC13118e;
    }

    public final void yandex(AbstractC13118e abstractC13118e) {
        C10872e c10872e;
        int i;
        InterfaceC5083e[] vip;
        synchronized (this) {
            try {
                int i2 = this.f24209e - 1;
                this.f24209e = i2;
                c10872e = this.f24210e;
                if (i2 == 0) {
                    this.f24208e = 0;
                }
                vip = abstractC13118e.vip(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5083e interfaceC5083e : vip) {
            if (interfaceC5083e != null) {
                interfaceC5083e.billing(Unit.INSTANCE);
            }
        }
        if (c10872e != null) {
            c10872e.inmobi(-1);
        }
    }
}
