package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7874e extends AbstractC17555e {
    @Override // defpackage.AbstractC17555e
    public final C0521e ad(RandomAccessFile randomAccessFile) {
        C0521e c0521e = new C0521e();
        Csuper.m4637final(randomAccessFile);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) Csuper.m4637final(randomAccessFile).f36471e));
        if (AbstractC1983e.advert(dataInputStream) == 0) {
            long smaato = AbstractC1983e.smaato(dataInputStream) / 1000;
            long smaato2 = AbstractC1983e.smaato(dataInputStream) / 1000;
            AbstractC1983e.smaato(dataInputStream);
            AbstractC1983e.smaato(dataInputStream);
            AbstractC1983e.smaato(dataInputStream);
            int smaato3 = ((int) AbstractC1983e.smaato(dataInputStream)) / 1000;
            AbstractC1983e.smaato(dataInputStream);
            AbstractC1983e.smaato(dataInputStream);
            AbstractC1983e.smaato(dataInputStream);
            AbstractC1983e.advert(dataInputStream);
            AbstractC1983e.advert(dataInputStream);
            c0521e.license = (int) smaato2;
            c0521e.mopub = smaato3;
            c0521e.startapp = smaato != smaato2;
        }
        return c0521e;
    }

    @Override // defpackage.AbstractC17555e
    public final InterfaceC1425e vip(RandomAccessFile randomAccessFile) {
        Csuper.m4637final(randomAccessFile);
        Csuper.m4637final(randomAccessFile);
        Csuper m4637final = Csuper.m4637final(randomAccessFile);
        while (!"CONT".equals((String) m4637final.f36469e)) {
            m4637final = Csuper.m4637final(randomAccessFile);
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) m4637final.f36471e));
        String mopub = AbstractC1983e.mopub(dataInputStream, AbstractC1983e.advert(dataInputStream));
        String mopub2 = AbstractC1983e.mopub(dataInputStream, AbstractC1983e.advert(dataInputStream));
        String mopub3 = AbstractC1983e.mopub(dataInputStream, AbstractC1983e.advert(dataInputStream));
        String mopub4 = AbstractC1983e.mopub(dataInputStream, AbstractC1983e.advert(dataInputStream));
        AbstractC14985e abstractC14985e = new AbstractC14985e();
        try {
            abstractC14985e.purchase(abstractC14985e.ad(EnumC8271e.TITLE, mopub.length() == 0 ? mopub2 : mopub));
            EnumC8271e enumC8271e = EnumC8271e.ARTIST;
            if (mopub.length() == 0) {
                mopub2 = mopub3;
            }
            abstractC14985e.purchase(abstractC14985e.ad(enumC8271e, mopub2));
            abstractC14985e.purchase(abstractC14985e.ad(EnumC8271e.COMMENT, mopub4));
            return abstractC14985e;
        } catch (C12795e e) {
            throw new RuntimeException(e);
        }
    }
}
