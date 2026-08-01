package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3234e extends AbstractC1056e {
    public static final C7936e metrica;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        metrica = new C7936e(2);
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [eًٖٕ, eُٚۜ, eۣؒ۟, eُؔؒ] */
    /* JADX WARN: Type inference failed for: r9v9, types: [eًٖٕ, eُٚۜ, eۣؒ۟, eٖؐۨ] */
    @Override // defpackage.AbstractC1056e
    public final InterfaceC1425e appmetrica(FileChannel fileChannel, String str, boolean z) {
        C16012e ad = C16012e.ad(AbstractC1983e.startapp(fileChannel, C16012e.license));
        if (ad == null) {
            throw new Exception(AbstractC10257e.adcel(str, " Not a valid dsf file. Content does not start with 'DSD '."));
        }
        long j = ad.metrica;
        C7936e c7936e = metrica;
        if (j <= 0) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i = C1724e.ad;
            return null;
        }
        fileChannel.position(j);
        C13538e ad2 = C13538e.ad(AbstractC1983e.startapp(fileChannel, (int) (fileChannel.size() - fileChannel.position())));
        if (ad2 == null) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            return null;
        }
        ByteBuffer byteBuffer = ad2.ad;
        byte b = byteBuffer.get(3);
        try {
            if (b == 2) {
                ?? abstractC11095e = new AbstractC11095e();
                abstractC11095e.f31355e = false;
                abstractC11095e.f31354e = false;
                abstractC11095e.f31887e = BuildConfig.FLAVOR;
                abstractC11095e.read(byteBuffer);
                return abstractC11095e;
            }
            if (b != 3) {
                if (b == 4) {
                    return new C13292e(byteBuffer);
                }
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i3 = C1724e.ad;
                return null;
            }
            ?? abstractC11095e2 = new AbstractC11095e();
            abstractC11095e2.f21192e = false;
            abstractC11095e2.f21191e = false;
            abstractC11095e2.f21193e = false;
            abstractC11095e2.f21195e = false;
            abstractC11095e2.f21194e = 0;
            abstractC11095e2.f31887e = BuildConfig.FLAVOR;
            abstractC11095e2.read(byteBuffer);
            return abstractC11095e2;
        } catch (AbstractC7384e unused) {
            throw new Exception(AbstractC10257e.adcel(str, " Could not read ID3v2 tag:corruption"));
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, eٍؘؕ] */
    @Override // defpackage.AbstractC1056e
    public final C0521e license(FileChannel fileChannel, String str) {
        C9233e c9233e;
        if (C16012e.ad(AbstractC1983e.startapp(fileChannel, C16012e.license)) == null) {
            throw new Exception(AbstractC10257e.adcel(str, " Not a valid dsf file. Content does not start with 'DSD '"));
        }
        int i = AbstractC3395e.vip + 8;
        ByteBuffer startapp = AbstractC1983e.startapp(fileChannel, i);
        C7936e c7936e = C9233e.vip;
        String adcel = AbstractC1983e.adcel(startapp);
        EnumC14466e[] enumC14466eArr = EnumC14466e.f28598e;
        if ("fmt ".equals(adcel)) {
            ?? obj = new Object();
            obj.ad = startapp.getLong();
            c9233e = obj;
        } else {
            c9233e = null;
        }
        if (c9233e == null) {
            throw new Exception(AbstractC10257e.adcel(str, " Not a valid dsf file. Content does not include 'fmt ' chunk"));
        }
        ByteBuffer startapp2 = AbstractC1983e.startapp(fileChannel, (int) (c9233e.ad - i));
        C7936e c7936e2 = C9233e.vip;
        C0521e c0521e = new C0521e();
        if (startapp2.limit() < 40) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e2.getClass();
            int i2 = C1724e.ad;
            return c0521e;
        }
        startapp2.order(ByteOrder.LITTLE_ENDIAN);
        startapp2.getInt();
        startapp2.getInt();
        startapp2.getInt();
        int i3 = startapp2.getInt();
        int i4 = startapp2.getInt();
        int i5 = startapp2.getInt();
        long j = startapp2.getLong();
        startapp2.getInt();
        c0521e.yandex = "DSF";
        c0521e.license = i5 * i4 * i3;
        c0521e.billing = i5;
        c0521e.appmetrica = i3;
        c0521e.purchase = i4;
        c0521e.advert = j;
        c0521e.mopub = ((float) j) / i4;
        c0521e.startapp = false;
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e2.getClass();
        int i6 = C1724e.ad;
        return c0521e;
    }
}
