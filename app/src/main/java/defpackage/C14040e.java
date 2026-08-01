package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14040e {
    public final Function1 ad;
    public boolean adcel;
    public C17866e metrica;
    public int mopub;
    public Object vip;
    public int license = -1;
    public final C0583e appmetrica = AbstractC16565e.license();
    public final C0583e purchase = new C0583e();
    public final C12618e billing = new C12618e();
    public final C12431e yandex = new C12431e(0, new C6656e[16]);
    public final C2336e startapp = new C2336e(1, this);
    public final C0583e advert = AbstractC16565e.license();
    public final HashMap smaato = new HashMap();

    public C14040e(Function1 function1) {
        this.ad = function1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean ad(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14040e.ad(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void license() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14040e.license():void");
    }

    public final void metrica(Object obj, Object obj2) {
        C0583e c0583e = this.appmetrica;
        AbstractC16565e.appmetrica(c0583e, obj2, obj);
        if (!(obj2 instanceof C6656e) || c0583e.metrica(obj2)) {
            return;
        }
        AbstractC16565e.purchase(this.advert, obj2);
        this.smaato.remove(obj2);
    }

    public final void vip(Object obj, int i, Object obj2, C17866e c17866e) {
        int i2;
        if (this.mopub > 0) {
            return;
        }
        int metrica = c17866e.metrica(obj);
        if (metrica < 0) {
            metrica = ~metrica;
            i2 = -1;
        } else {
            i2 = c17866e.metrica[metrica];
        }
        c17866e.vip[metrica] = obj;
        c17866e.metrica[metrica] = i;
        if ((obj instanceof C6656e) && i2 != i) {
            C16208e startapp = ((C6656e) obj).startapp();
            this.smaato.put(obj, startapp.purchase);
            C17866e c17866e2 = startapp.appmetrica;
            C0583e c0583e = this.advert;
            AbstractC16565e.purchase(c0583e, obj);
            Object[] objArr = c17866e2.vip;
            long[] jArr = c17866e2.ad;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                InterfaceC17335e interfaceC17335e = (InterfaceC17335e) objArr[(i3 << 3) + i5];
                                if (interfaceC17335e instanceof AbstractC6329e) {
                                    ((AbstractC6329e) interfaceC17335e).license(2);
                                }
                                AbstractC16565e.metrica(c0583e, interfaceC17335e, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof AbstractC6329e) {
                ((AbstractC6329e) obj).license(2);
            }
            AbstractC16565e.metrica(this.appmetrica, obj, obj2);
        }
    }
}
