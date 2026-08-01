package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;
import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.message.Conversation;
import ua.itaysonlab.vkapi2.objects.message.ConversationChatPhoto;
import ua.itaysonlab.vkapi2.objects.message.ConversationChatSettings;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8967e extends startapp {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C14539e f17995e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public LayoutInflater f17996e;

    public C8967e(C14539e c14539e) {
        this.f17995e = c14539e;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return this.f17995e.f8223e.size();
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void remoteconfig(loadAd loadad, int i) {
        C18348e c18348e = (C18348e) loadad;
        Integer valueOf = Integer.valueOf(R.drawable.placeholder_link);
        View view = c18348e.ad;
        TextView textView = c18348e.tapsense;
        ImageView imageView = c18348e.signatures;
        C14539e c14539e = this.f17995e;
        Conversation conversation = (Conversation) c14539e.f8223e.get(i);
        ConversationChatSettings conversationChatSettings = conversation.vip;
        Object obj = null;
        if (conversationChatSettings != null) {
            ConversationChatPhoto conversationChatPhoto = conversationChatSettings.vip;
            AbstractC2379e.metrica(imageView, conversationChatPhoto != null ? conversationChatPhoto.vip : null, valueOf, new C9377e(new C15878e(), 14));
            textView.setText(conversation.vip.ad);
        } else {
            Iterator it = c14539e.f28750e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((VKProfile) next).ad == conversation.ad.ad) {
                    obj = next;
                    break;
                }
            }
            VKProfile vKProfile = (VKProfile) obj;
            if (vKProfile == null) {
                vKProfile = VKProfile.yandex;
            }
            AbstractC2379e.metrica(imageView, vKProfile.license, valueOf, new C9377e(new C15878e(), 14));
            textView.setText(vKProfile.ad());
        }
        VKXApplication.Companion companion = VKXApplication.f36531e;
        view.setPadding(VKXApplication.Companion.ad(16.0f), view.getPaddingTop(), VKXApplication.Companion.ad(16.0f), view.getPaddingBottom());
        view.setOnClickListener(new ViewOnClickListenerC0858e(conversation, c18348e, 1));
    }

    @Override // androidx.recyclerview.widget.startapp
    public final loadAd signatures(ViewGroup viewGroup, int i) {
        if (this.f17996e == null) {
            this.f17996e = LayoutInflater.from(viewGroup.getContext());
        }
        return new C18348e(this.f17996e.inflate(R.layout.catalog_vertical_item, viewGroup, false));
    }
}
