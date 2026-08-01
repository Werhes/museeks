package defpackage;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5568e extends AbstractC7691e {
    @Override // defpackage.AbstractC7691e
    public final void billing(InterfaceC1425e interfaceC1425e, FileChannel fileChannel, String str) {
        C0158e c0158e = new C0158e(str);
        C7936e c7936e = C0158e.vip;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        c7936e.getClass();
        int i = C1724e.ad;
        int i2 = C12927e.license().signatures;
        try {
            C0829e yandex = c0158e.yandex(fileChannel);
            fileChannel.position(0L);
            try {
                C0829e c0829e = (C0829e) interfaceC1425e;
                if (i2 == 3) {
                    c0158e.amazon(c0829e, fileChannel, yandex);
                } else if (i2 == 2) {
                    c0158e.advert(c0829e, fileChannel, yandex);
                } else if (i2 == 1) {
                    c0158e.smaato(c0829e, fileChannel, yandex);
                } else if (i2 == 5) {
                    c0829e.admob();
                    c0158e.amazon(c0829e, fileChannel, yandex);
                } else {
                    if (i2 != 4) {
                        throw new RuntimeException(str + " No setting for:WavSaveOptions");
                    }
                    c0829e.admob();
                    c0158e.smaato(c0829e, fileChannel, yandex);
                }
                C0158e.mopub(fileChannel);
            } catch (IOException e) {
                throw new Exception(AbstractC8703e.admob(e, AbstractC8703e.isPro(str, ":")));
            }
        } catch (IOException e2) {
            throw new Exception(AbstractC8703e.admob(e2, AbstractC8703e.isPro(str, ":")));
        }
    }

    @Override // defpackage.AbstractC7691e
    public final void purchase(FileChannel fileChannel, String str) {
        C0158e c0158e = new C0158e(str);
        C7936e c7936e = C0158e.vip;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        c7936e.getClass();
        int i = C1724e.ad;
        try {
            C0829e yandex = c0158e.yandex(fileChannel);
            fileChannel.position(0L);
            boolean z = yandex.f3215e;
            if (z && yandex.f3217e) {
                C10233e ad = C0158e.ad(yandex, fileChannel);
                if (!ad.metrica) {
                    C14267e c14267e = yandex.f3214e;
                    C18524e Signature = c0158e.Signature(yandex, fileChannel);
                    C18524e loadAd = c0158e.loadAd(yandex, fileChannel);
                    if (C0158e.adcel(yandex, fileChannel)) {
                        fileChannel.truncate(c14267e.f28203e.longValue());
                        c0158e.appmetrica(fileChannel, yandex, loadAd);
                    } else if (C0158e.startapp(yandex, fileChannel)) {
                        fileChannel.truncate(yandex.Signature());
                        c0158e.purchase(fileChannel, yandex, Signature);
                    } else {
                        c0158e.appmetrica(fileChannel, yandex, loadAd);
                        C0829e yandex2 = c0158e.yandex(fileChannel);
                        fileChannel.position(0L);
                        c0158e.purchase(fileChannel, yandex2, Signature);
                    }
                } else if (ad.license) {
                    if (ad.vip) {
                        Long l = yandex.f3214e.f28203e;
                        c7936e.getClass();
                        fileChannel.truncate(yandex.f3214e.f28203e.longValue());
                    } else {
                        yandex.Signature();
                        c7936e.getClass();
                        fileChannel.truncate(yandex.Signature());
                    }
                } else if (ad.vip) {
                    c0158e.billing(fileChannel, (int) yandex.yandex(), (int) (yandex.yandex() - yandex.f3214e.f28203e.longValue()));
                } else {
                    c0158e.billing(fileChannel, yandex.f3214e.f28202e.intValue(), (int) (yandex.f3214e.f28202e.intValue() - yandex.Signature()));
                }
            } else if (yandex.f3217e) {
                C14267e c14267e2 = yandex.f3214e;
                C18524e Signature2 = c0158e.Signature(yandex, fileChannel);
                if (c14267e2.f28202e.longValue() == fileChannel.size()) {
                    c7936e.getClass();
                    fileChannel.truncate(c14267e2.f28203e.longValue());
                } else {
                    c0158e.purchase(fileChannel, yandex, Signature2);
                }
            } else if (z) {
                C18524e loadAd2 = c0158e.loadAd(yandex, fileChannel);
                if (C0158e.startapp(yandex, fileChannel)) {
                    yandex.Signature();
                    c7936e.getClass();
                    fileChannel.truncate(yandex.Signature());
                } else {
                    c0158e.appmetrica(fileChannel, yandex, loadAd2);
                }
            }
            C0158e.mopub(fileChannel);
        } catch (IOException e) {
            throw new Exception(AbstractC8703e.admob(e, AbstractC8703e.isPro(str, ":")));
        }
    }
}
