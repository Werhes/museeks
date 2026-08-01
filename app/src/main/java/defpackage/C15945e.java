package defpackage;

import android.view.textclassifier.TextClassifier;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.cert.Extension;
import java.security.cert.PKIXRevocationChecker;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖؓ */
/* loaded from: classes.dex */
public final /* synthetic */ class C15945e implements InterfaceC0099e, InterfaceC8427e, InterfaceC4871e, InterfaceC6044e, InterfaceC9247e, InterfaceC13824e, InterfaceC9650e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f31403e;

    public /* synthetic */ C15945e(int i) {
        this.f31403e = i;
    }

    public /* synthetic */ C15945e(C4526e c4526e) {
        this.f31403e = 26;
    }

    public static /* bridge */ /* synthetic */ Extension appmetrica(Object obj) {
        return (Extension) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier license(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* bridge */ /* synthetic */ boolean startapp(Object obj) {
        return obj instanceof PKIXRevocationChecker;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        C6268e c6268e = (C6268e) obj;
        switch (this.f31403e) {
            case 2:
                c6268e.stop();
                return;
            case 3:
                c6268e.mo2078e();
                return;
            case 4:
                c6268e.mo2125final();
                return;
            case 5:
                c6268e.license();
                return;
            default:
                c6268e.mo2139this();
                return;
        }
    }

    @Override // defpackage.InterfaceC0099e
    public void ad(C6268e c6268e, C18424e c18424e, List list) {
        switch (this.f31403e) {
            case 0:
                c6268e.mo2101e(list);
                return;
            default:
                c6268e.mo2101e(list);
                return;
        }
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        switch (this.f31403e) {
            case 8:
                C14809e c14809e = (C14809e) obj;
                c14809e.getClass();
                C12894e c12894e = AbstractC18024e.ad;
                c12894e.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c12894e.admob(c14809e, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return C6097e.vip;
        }
    }

    @Override // defpackage.InterfaceC9247e
    public C12524e purchase(AbstractC14783e abstractC14783e) {
        C12524e c12524e = ((C0251e) abstractC14783e).ad;
        C0251e.smaato(c12524e);
        return c12524e;
    }

    @Override // defpackage.InterfaceC6044e
    public boolean vip(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.InterfaceC13824e
    public void yandex(InterfaceC7970e interfaceC7970e) {
    }
}
