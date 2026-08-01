package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11794e implements InterfaceC18435e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C11794e f23667e = new C11794e();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f23668e = AbstractC9743e.vip();

    static {
        C5363e c5363e = AbstractC16696e.ad;
        if (AbstractC16268e.purchase().vip().exists()) {
            return;
        }
        AbstractC16268e.purchase().vip().mkdir();
    }

    public static void ad(AppActivity appActivity, String str, AudioPlaylist audioPlaylist, List list) {
        C2464e c2464e = C2464e.appmetrica;
        C0389e c0389e = new C0389e(audioPlaylist, list, str);
        c2464e.getClass();
        C2464e.metrica(appActivity, c0389e);
    }

    public static boolean appmetrica(AudioPlaylist audioPlaylist) {
        int i = audioPlaylist.isPro;
        long j = audioPlaylist.applovin;
        C4199e m4502e = C18353e.vip.m4502e();
        if (m4502e != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('_');
            sb.append(i);
            CachedPlaylist cachedPlaylist = (CachedPlaylist) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{sb.toString()}, 1)));
            if (cachedPlaylist != null) {
                return cachedPlaylist.m4706this();
            }
        }
        return false;
    }

    public static Object metrica(AudioTrack audioTrack, AbstractC7185e abstractC7185e) {
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC5336e.advert(ExecutorC3603e.f8134e, new C9042e(audioTrack, null, 5), abstractC7185e);
    }

    public static Object purchase(AbstractC7185e abstractC7185e) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC1641e.smaato(new File(vKXApplication.getCacheDir().getAbsolutePath()));
        C5363e c5363e = AbstractC16696e.ad;
        AbstractC1641e.smaato(AbstractC16268e.purchase().vip());
        AbstractC16268e.purchase().vip().mkdir();
        Object appmetrica = C18353e.ad.appmetrica(abstractC7185e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    public static void vip() {
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        File file = c7838e.f15863e;
        C7838e c7838e2 = VKXApplication.f36530e;
        if (c7838e2 == null) {
            c7838e2 = null;
        }
        C5455e c5455e = c7838e2.f15876e;
        HashSet hashSet = C8531e.adcel;
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.delete();
            } else {
                if (c5455e != null) {
                    long adcel = C8531e.adcel(listFiles);
                    if (adcel != -1) {
                        try {
                            String hexString = Long.toHexString(adcel);
                            try {
                                String str = "ExoPlayerCacheFileMetadata" + hexString;
                                SQLiteDatabase writableDatabase = c5455e.getWritableDatabase();
                                writableDatabase.beginTransactionNonExclusive();
                                try {
                                    AbstractC1283e.vip(writableDatabase, 2, hexString);
                                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                } catch (Throwable th) {
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            } catch (SQLException e) {
                                throw new IOException(e);
                            }
                        } catch (C3981e unused) {
                            AbstractC2803e.smaato("SimpleCache", "Failed to delete file metadata: " + adcel);
                        }
                        try {
                            C11467e.remoteconfig(c5455e, Long.toHexString(adcel));
                        } catch (C3981e unused2) {
                            AbstractC2803e.smaato("SimpleCache", "Failed to delete file metadata: " + adcel);
                        }
                    }
                }
                AbstractC9413e.m2561private(file);
            }
        }
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC1641e.smaato(new File(vKXApplication.getCacheDir().getAbsolutePath()));
        VKXApplication vKXApplication2 = VKXApplication.f36528e;
        AbstractC1641e.smaato((vKXApplication2 != null ? vKXApplication2 : null).getDir("artworkCache", 0));
    }

    public static Uri yandex(AudioTrack audioTrack) {
        C10675e purchase;
        if (audioTrack.firebase) {
            if (audioTrack.f36495goto) {
                purchase = AbstractC4224e.purchase(3, AbstractC6914e.billing(audioTrack));
            } else if (audioTrack.f36493class) {
                purchase = AbstractC4224e.purchase(2, AbstractC6914e.billing(audioTrack));
            } else {
                AudioAlbum audioAlbum = audioTrack.amazon;
                purchase = audioAlbum != null ? AbstractC4224e.purchase(4, audioAlbum.vip()) : null;
            }
            if (purchase != null) {
                return Uri.parse(purchase.f21024e.remoteconfig());
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f23668e.f29359e;
    }

    public final void billing(AudioTrack audioTrack) {
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(this, ExecutorC3603e.f8134e, 0, new C14308e(audioTrack, null, 0), 2);
    }
}
